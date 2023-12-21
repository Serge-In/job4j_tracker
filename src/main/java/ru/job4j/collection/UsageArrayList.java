package ru.job4j.collection;
import java.util.ArrayList;
/**
 * 2023-12-21
 * 2. Коллекции, ArrayList, List, Обобщения [#10094]
 * main создайте объект ArrayList с типом String. Добавьте в него 3 имени: Petr, Ivan, Stepan.
 * Далее через цикл for-each выведите все элементы на консоль.
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Petr");
        arrayList.add("Ivan");
        arrayList.add("Stepan");
        for (String el : arrayList) {
            System.out.println(el);
        }
    }
}
