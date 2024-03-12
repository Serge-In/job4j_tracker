package ru.job4j.function;

import java.util.*;

/**
 * 2024-03-12
 * 2.4. Отложенное исполнение лямбды [#249211]
 * Лямбда обладает свойством отложенного выполнения (deferred execution).
 * У отложенного выполнения есть и "брат-близнец" - ленивая загрузка (lazy load).
 * код внутри неё начнет выполняться только тогда, когда произойдёт обращение за его результатом.
 */
public class LazyLoad {
    public static void main(String[] args) {
        String[] names = {
                "Ivan",
                "Pole"
        };
        Comparator<String> lengthComparator = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthComparator);
    }
}
