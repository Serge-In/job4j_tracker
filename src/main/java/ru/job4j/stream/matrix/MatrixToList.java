package ru.job4j.stream.matrix;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2024-03-21
 * 10. Преобразование матрицы чисел в список чисел. FlatMap. [#110228]
 *  реализовать метод, который выполняет преобразование этой матрицы Integer[][] в список чисел List<Integer>.
 *  нужно использовать методы flatMap(), collect(), Stream.of().
 */
public class MatrixToList {
    public static List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}