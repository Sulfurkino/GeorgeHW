package ArrayHW;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6 {
    //        Задача 6: Слияние двух отсортированных списков
//        Условие: Даны два отсортированных списка. Создай третий отсортированный список, содержащий все элементы обоих.
//        list1 = [1, 3, 5, 7, 9]
//        list2 = [2, 4, 6, 8, 10, 12]
//        result = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12]

    public List<Integer> task4Method(List<Integer> list1, List<Integer> list2){
        List<Integer> result = Stream
                .concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        return result;
    }

}
