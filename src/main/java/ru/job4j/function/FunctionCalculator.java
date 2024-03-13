package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 2024-03-13
 * 6. Подсчет функции в диапазоне. [#24251]
 * реализовать метод подсчета функции в диапазоне от start до end (не включаем в диапазон).
 */
public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> result = new ArrayList<>();
        for (double i = start; i < end; i++) {
            result.add(function.apply(i));
        }
        return result;
    }
}
