package ru.job4j.function;
/**
 * 2024-03-11
 * 2.2. Функциональный интерфейс [#247497]
 * 1. Замените вставку элементов в карту на использование BiConsumer, он уже объявлен, требуется его реализовать.
 * 2. Замените проверку в if() на использование BiPredicate
 * 3. Заменить создание ArrayList из значений Map на Supplier
 * 4. Заменить вывод строк на применение Consumer
 * 5. Заменить преобразование строк к строкам в верхнем регистре с помощью Function
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (first, second) -> map.put(first, second);

        biConsumer.accept(1, "one");
        biConsumer.accept(2, "two");
        biConsumer.accept(3, "three");
        biConsumer.accept(4, "four");
        biConsumer.accept(5, "five");
        biConsumer.accept(6, "six");
        biConsumer.accept(7, "seven");

        BiPredicate<Integer, String> biPredicate = (first, second) -> (first % 2 == 0 || second.length() == 4);

        for (Integer key : map.keySet()) {
            if (biPredicate.test(key, map.get(key))) {
                System.out.println("key: " + key + " value: " + map.get(key));
            }
        }
        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());

        Function<String, String> function = (first) -> (first.toUpperCase());
        Consumer<String> consumer = (first) -> System.out.println(function.apply(first));

        for (String string : supplier.get()) {
            consumer.accept(string);
        }
    }
}


