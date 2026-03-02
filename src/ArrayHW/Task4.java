package ArrayHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    //                Задача 4: Частота слов
//        Условие: Дано предложение "кот собака кот рыба кот собака". Подсчитай, сколько раз встречается каждое слово.
//        Используй два ArrayList: один для слов, другой для счётчиков.

    public void task4Method(String sentence) {
        //создаём список через стрим
        List<String> wordList = Arrays.stream(sentence.split(" ")).toList();

        //список в котором содержатся слова предложения, но без повторов
        List<String> noRepList = new ArrayList<>();



        //перебираем предложение, если слово в предложении совпадает хотя бы с одним словом
        //в списке основных слов меняем на true и добавляем слово в список без повторов-
        for (String word : wordList) {
            //есть ли слово в списке основных слов -
            boolean found = false;

            for (String wordNoRep : noRepList) {
                if (word.equals(wordNoRep)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                noRepList.add(word);
            }
        }

        //после создания списка без повторов, мы готовы считать слова в предложении
        int size = wordList.size();

        //список с счётчиками слов
        List<Integer> counters = new ArrayList<>(
                Collections.nCopies(noRepList.size(), 0)
        );
        //Считаем
        for (int i = 0; i < noRepList.size(); i++) {
            String uniqueWord = noRepList.get(i);

            for (String word : wordList) {
                if (uniqueWord.equals(word)) {
                    counters.set(i, counters.get(i) + 1);
                }
            }
        }

        for (int i = 0; i < noRepList.size(); i++) {
            System.out.println(noRepList.get(i) + " -> " + counters.get(i));
        }


    }
}
