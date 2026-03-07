package MapTask;

import java.util.HashMap;
import java.util.Map;

//### Задача 4: Инвертирование Map
//
//**Условие:** Дана Map `{1: "один", 2: "два", 3: "три"}`. Создай обратную Map `{"один": 1, "два": 2, "три": 3}`.
public class Task4 {
    public Map<String, Integer> task4Method(Map<Integer,String> inputMap){
        Map<String,Integer> revMap = new HashMap<>();
        for (Map.Entry<Integer,String> data : inputMap.entrySet()){
            revMap.put(data.getValue(), data.getKey());
        }
        return revMap;
    }
}
