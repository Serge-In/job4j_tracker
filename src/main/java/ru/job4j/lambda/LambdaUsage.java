package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 2024-01-11
 * 2.1. Лямбда блок [#249208]
 *  Добавьте отладочную информацию в лямбда-выражении в этом каркасе.
 */
public class LambdaUsage {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeeee", "a",  "ccc", "dddd", "bb");
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare.length() : " + right + " : " + left + " -> " + right.length() + " : " + left.length());
            return Integer.compare(right.length(), left.length());
        };
        strings.sort(comparator);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}