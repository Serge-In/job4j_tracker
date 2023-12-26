package ru.job4j.collection;

import java.util.HashMap;

/**
 * 2023-12-26
 * 0. Map, HashMap [#212652]
 * Внутри метода main создайте коллекцию HashMap<String, String>.
 * Добавьте туда почту в качестве ключа и фио в качестве значения.
 * Добавьте цикл for-each по ключу и выведите на печать элементы коллекции.
 */

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("mail@1", "pupkin");
        hashMap.put("mail@2", "bobkin");
        System.out.println(hashMap);
        for (String key : hashMap.keySet()) {
            System.out.println(key + " = " + hashMap.get(key));
        }
    }
}
