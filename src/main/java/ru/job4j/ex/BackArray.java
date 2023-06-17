package ru.job4j.ex;

import java.util.Arrays;
/**
 * 2023-06-18
 * 0. Что такое исключение. [#3821  [#3821]]
 * Исправьте проблему в программе.
 */
public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - 1 - index];
            names[names.length - 1 - index] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}