package ArrayHW;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    //        Задание 3: Реверс списка вручную
//        Условие: Дан список чисел [1, 2, 3, 4, 5]. Переверни его без использования Collections.reverse()
//        — только с помощью методов ArrayList.


    public void task3Method(ArrayList<Integer> numbers) {
        int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            Integer tempNum = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, tempNum);

            left++;
            right--;
        }

        numbers.forEach(System.out::println);
    }
}
