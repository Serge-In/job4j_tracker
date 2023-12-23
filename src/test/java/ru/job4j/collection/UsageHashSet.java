package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Volvo");
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Toyota");
        System.out.println(autos);

        for (String auto : autos) {
            System.out.println(auto);
        }
        System.out.println(autos);
    }
}