package ru.job4j.tracker.output;

/**
 * 2023-06-16
 * 12.1 Зависимость от System.out [#33568 # [#33568]]
 * Консольный вывод
 */
public class Console implements Output {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}