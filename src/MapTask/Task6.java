package MapTask;

import java.lang.reflect.Array;
import java.util.*;

//### Задача 6: Анаграммы
//
//**Условие:** Две строки — анаграммы, если состоят из одних символов (например, "listen" и "silent").
// Проверь, являются ли две строки анаграммами.
public class Task6 {

    public void task6Method(String word1, String word2) {

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("это анаграмма");
        } else {
            System.out.println("это не анаграмма");
        }
    }
}

