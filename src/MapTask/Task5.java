package MapTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//## Задача 5: Два числа с заданной суммой (Two Sum)
//
//**Условие:** Дан массив чисел `[2, 7, 11, 15]` и целевая сумма `target = 9`. Найди два числа, которые дают эту сумму. Верни их индексы.
public class Task5 {

    public List<Integer> task5Method(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return List.of(map.get(complement), i);
            }

            map.put(nums[i], i);
        }

        return new ArrayList<>();
    }
}