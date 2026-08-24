package Stream;

import java.util.List;

public class FilterMutate {


    public static List<Integer> filter(List<Integer> list) {
        return  list.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> list =  List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(filter(list));
    }

}
