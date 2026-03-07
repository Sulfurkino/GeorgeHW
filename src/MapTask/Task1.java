package MapTask;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    //    ### Задание 1: Подсчёт частоты символов
//
//**Условие:** Дана строка `"абракадабра"`. Подсчитай, сколько раз встречается каждый символ, используя HashMap.
    public static Map<Character, Integer> task1Method(String string) {
        //таблица
        Map<Character, Integer> map = new HashMap<>();
        //Цикл переводит строку в массив char, проверяет есть ли ключ. Если нет, то добавляет, если есть, то +1
        for (char c : string.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        return map;

    }
}
