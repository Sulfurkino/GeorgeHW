package Exception;

public class Validate {
    //    Напиши класс `WeakPasswordException` (checked exception) и метод `validatePassword(String password)`,
//    который выбрасывает это исключение, если пароль короче 8 символов или не содержит цифр.
//    Продемонстрируй вызов метода с обработкой исключения.
    public static void validatePassword(String password) throws WeakPasswordException {
        if(password.length() < 8){
            throw new WeakPasswordException("Пароль короче 8и символов.");
        }
        if (password.chars().anyMatch(Character :: isDigit)){
            throw new WeakPasswordException("В пароле нет чисел");
        }

    }
}
