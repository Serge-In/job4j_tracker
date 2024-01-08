package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2024-01-08
 * 4. Сортировка номера [#221284]
 *  Ваша задача дописать компаратор, чтобы он сравнивал начальный номер.
 *  Expected: is ["1. Task.", "2. Task.", "10. Task."]
 *  В решении нас интересует шаблон номера задачи, который представлен в тесте выше, т.е. без вложенных номеров задач
 * Для реализации Вам понадобятся следующие методы:
 * - метод split() класса String - необходим для того, чтобы отделить часть строки, которая будет содержать номер задачи;
 * - метод Integer.parseInt() - позволит преобразовать строку, содержащее номер задачи в число типа Integer;
 * - метод Integer.compare() - позволит корректно сравнить номера задач.
 */
public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] arrLeft = left.split(". ");
        String[] arrRight = right.split(". ");
        return Integer.compare(Integer.parseInt(arrLeft[0]), Integer.parseInt(arrRight[0]));
    }
}