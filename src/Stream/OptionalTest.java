package Stream;

import Exception.NumbersParser.NumberFormatException;

import java.util.Map;
import java.util.Optional;

public class OptionalTest {
    Map<String, String> formData = Map.of(
            "age", "25",
            "salary", "не число",
            "name", "  ",       // только пробелы
            "city", "Москва"
    );

    // 1. Напиши метод getField(Map<String, String> form, String key) -> Optional<String>
//    Возвращает пустой Optional если:
//    - ключ отсутствует в Map
//    - значение null
//    - значение пустое или состоит только из пробелов
//    Иначе — Optional с trim()-нутым значением.
    public static Optional<String> getField(Map<String, String> form, String key) {
        return Optional.ofNullable(form.get(key))
                .map(String::trim)
                .filter(value -> !value.isEmpty());
    }

    // 2. Напиши метод parseInteger(Map<String, String> form, String key) -> Optional<Integer>
//    Использует getField внутри.
//    Если значение есть, но не парсится в число — вернуть пустой Optional,
//    НЕ бросать NumberFormatException наружу.
    public static Optional<Integer> parseInteger(Map<String, String> form, String key) {
        //map - работаем с оберткой, возвращает Optional<Optional<Integer>>
        //flatMap - возвращает Optional<Integer>
        return getField(form, key)
                .flatMap(value -> {
                    try {
                        return Optional.of(Integer.parseInt(value));
                    } catch (NumberFormatException e) {
                        return Optional.empty();
                    }
                });
    }

    // 3. Собери объект из формы. Если обязательные поля отсутствуют — верни пустой Optional.
//    Необязательное поле salary — если не распарсилось, подставить 0.
    public record Employee(String name, String city, int age, int salary) {
    }

    public static Optional<Employee> buildEmployee(Map<String, String> form) {
        Optional<String> name = getField(form, "name");
        Optional<String> city = getField(form, "city");
        Optional<Integer> age = parseInteger(form, "age");
        int salary = parseInteger(form, "salary").orElse(0);

        return name.flatMap(n ->
                city.flatMap(c ->
                        age.map(a ->
                                new Employee(n, c, a, salary))));

    }


}
