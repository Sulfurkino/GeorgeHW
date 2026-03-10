package MapTask;

import java.util.List;
import java.util.Map;

public class MapTaskMain {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.task6Method("кот","ток");

        List<String> words = List.of("кот", "ток", "сон", "нос", "abc", "cab");

        Map<String, List<String>> result = Task7.task7Method(words);

        System.out.println(result);

        Task7 task7 = new Task7();

        task7.task7Method(words);
        System.out.println(words);
    }
}
