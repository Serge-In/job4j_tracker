package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2024-03-17
 * 1. Stream API [#58166]
 *  - заполнить список numbers значениями, *  т.е. вместо ... указать значения чисел,
 *  которыми будет заполнен наш список - это должны быть как положительные числа так и отрицательные;
 *  - вместо ... в методе filter() надо записать условие таким образом,
 *  чтобы в потоке остались только положительные числа (0 это не положительное число и не отрицательное);
 *  - вместо ... в методе collect() надо записать коллектор, который позволит собрать элементы потока с список.
 *
 */
public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-2, 0, 3, 5, -10, 4);
        List<Integer> positive = numbers.stream().filter(x -> x % 2 == 0 && x != 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}