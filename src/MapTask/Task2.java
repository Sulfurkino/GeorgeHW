package MapTask;
//### Задание 2: Группировка студентов по оценкам
//
//**Условие:** Дан список студентов с оценками. Сгруппируй их по оценке: Map<Integer, List<String>>.
//
//**Подсказка:** Используй `computeIfAbsent` для автоматического создания списка.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    public static Map<Integer, List<String>> task2Method (Map<String, Integer> students) {
        Map<Integer, List<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            String name = entry.getKey();
            Integer grade = entry.getValue();

            result.computeIfAbsent(grade, k -> new ArrayList<>()).add(name);
        }

        return result;
    }


}
