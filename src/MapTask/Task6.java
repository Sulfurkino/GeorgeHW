package MapTask;

import java.lang.reflect.Array;
import java.util.*;

//### Задача 6: Анаграммы
//
//**Условие:** Две строки — анаграммы, если состоят из одних символов (например, "listen" и "silent").
// Проверь, являются ли две строки анаграммами.
public class Task6 {
    public void task6Method(String word1, String word2) {
        Set<Character> word1Arr = new HashSet<>();
        Set<Character> word2Arr = new HashSet<>();
        for (char c : word1.toCharArray()){
            word1Arr.add(c);
        }
        for (char c : word2.toCharArray()){
            word2Arr.add(c);
        }
        word1Arr.retainAll(word2Arr);
        if (word1Arr.isEmpty()){
            System.out.println("это анаграмма");
        }else {
            System.out.println("это не анаграмма");
        }


    }
}

