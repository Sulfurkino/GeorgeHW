package MapTask;

import java.util.*;

//### Задача 7: Группировка анаграмм
//
//**Условие:** Дан список слов. Сгруппируй анаграммы
//        вместе: `["кот", "ток", "сон", "нос", "abc", "cab"]` → `{кот=[кот, ток], нос=[сон, нос], abc=[abc, cab]}`.
public class Task7 {
    public static Map<String, List<String>> task7Method(List<String> wordsList) {
        Map<String, List<String>> result = new HashMap<>();
        for (int i = 0; i < wordsList.size(); i++) {
            for (String word : wordsList) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);

                result.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }
        }
        return result;
    }
}
