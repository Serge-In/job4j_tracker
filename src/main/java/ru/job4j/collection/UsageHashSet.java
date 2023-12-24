package ru.job4j.collection;

import java.util.HashSet;

/**
 * 2023-12-23
 * 0. Set, HashSet, Iterator. [#10095]
 * Добавьте в коллекцию autos марки машин: Lada, BMW, Volvo, Toyota.
 * Добавьте цикл for-each и выведите элементы коллекции HashSet на консоль.
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Volvo");
        autos.add("Toyota");
        autos.add("Toyota");
        autos.add("Lada");
        autos.add("Toyota");
        autos.add("BMW");
        autos.add("Toyota");

        System.out.println(autos);
    }
}