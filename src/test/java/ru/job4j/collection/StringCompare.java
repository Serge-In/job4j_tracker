package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2024-01-08
 * 3. Компаратор для строк [#35008 #471358]
 * Необходимо реализовать поэлементное сравнение двух списков,
 * т.е. сравниваем элементы двух списков, находящихся на одних и тех же позициях (под одним и тем же индексом).
 * Сравнение в лексикографическом порядке.
 * В этом задании нельзя использовать метод String.compareTo.
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] charsLeft = left.toCharArray();
        char[] charsRight = right.toCharArray();
        int rsl = 0;
        int minLength = charsLeft.length;

        if (charsLeft.length < charsRight.length) {
            rsl = -1;
            minLength = charsLeft.length;
        } else if (charsLeft.length > charsRight.length) {
            rsl = 1;
            minLength = charsRight.length;
        }

        int compare = 0;
        for (int i = 0; i < minLength; i++) {
            compare = Character.compare(charsLeft[i], charsRight[i]);
            if (compare != 0) {
                rsl = compare;
                break;
            }
        }
        return rsl;
    }
}
