package MapTask;

import java.util.HashMap;
import java.util.Map;


//## Задача 3: Словарь
//
//**Условие:** Создай англо-русский словарь (HashMap). Добавь 7 слов, реализуй перевод в обе стороны
//        (для обратного перевода — создай второй Map).
public class Task3 {
    Map<String,String> dictionary = new HashMap<>();
    Map<String,String> reverseDictionary = new HashMap<>();

    public String methodTask3(String word){
        dictionary.put("Apple", "яблоко");
        reverseDictionary.put("яблоко","Apple");

        if (dictionary.containsKey(word)){
            return dictionary.get(word);
        } else if (reverseDictionary.containsKey(word)) {
            return reverseDictionary.get(word);
        } else{
            System.out.println("uknown word");
            return null;
        }

    }
}
