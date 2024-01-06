package ru.job4j.tracker;

import java.util.Comparator;

/**
 * 2024-01-06
 * 0. Сортировка [#10096]
 * Создайте для модели данных ru.job4j.tracker.Item компаратор, который сортирует данные по убыванию имени.
 * Компаратору присвойте имя ItemDescByName.
 */

public class ItemDescByName implements Comparator<Item> {
    @Override
    public int compare(Item left, Item right) {
        return right.getName().compareTo(left.getName());
    }
}
