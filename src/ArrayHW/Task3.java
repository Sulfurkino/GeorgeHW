package ArrayHW;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    //        Задание 3: Реверс списка вручную
//        Условие: Дан список чисел [1, 2, 3, 4, 5]. Переверни его без использования Collections.reverse()
//        — только с помощью методов ArrayList.


    public void task3Method(ArrayList<Integer> numbers) {
        //я так понимаю создание отдельной переменной делает код чище  -
        int size = numbers.size();

        for (int i = 0; i < size; i++) {
            numbers.set(i, size - i);
        }
        numbers.forEach(System.out::println);
    }
}
