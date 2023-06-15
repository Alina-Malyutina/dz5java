package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var dict = new HashMap<String, String>();
        dict.put("88517586475", "Алина Малютина");
        dict.put("88213476846", "Алина Малютина");
        dict.put("88748938458", "Александр Давыдов");
        dict.put("88657483674", "Александр Давыдов");
        dict.put("88327834753", "Мария Бисикова");
        dict.put("88378844738", "Влад Потапов");
        dict.put("88032483984", "Влад Потапов");
        dict.put("88834793248", "Влад Потапов");
        dict.put("88938478394", "Евгений Смирнов");
        dict.put("88843947394", "Сергей Сбитнев");

        var a = get(dict);

        a.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }


    public static HashMap<String, Integer> get(HashMap<String, String> dict){
        var result = new HashMap<String, Integer>();
        for (var item : dict.entrySet()) {
            if (result.containsKey(item.getValue())) {
                var key = item.getValue();
                var value = result.get(item.getValue());
                result.replace(key, value + 1);
            } else {
                result.put(item.getValue(), 1);
            }
        }
        return result;
    }
}