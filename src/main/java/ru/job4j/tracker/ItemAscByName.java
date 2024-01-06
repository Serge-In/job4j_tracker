package ru.job4j.tracker;

import java.util.Comparator;

/**
 * 2024-01-06
 * 0. Сортировка [#10096]
 * Создайте для модели данных ru.job4j.tracker.Item компаратор, который сортирует данные по возрастанию имени.
 * Компаратору присвойте имя ItemAscByName.
 */

public class ItemAscByName implements Comparator<Item> {
    @Override
    public int compare(Item left, Item right) {
        return left.getName().compareTo(right.getName());
    }
}
