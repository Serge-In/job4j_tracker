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
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return Character.compare(left.charAt(i), right.charAt(i));
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
