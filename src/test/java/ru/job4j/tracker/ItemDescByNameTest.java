package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 2024-12-06
 * 0. Сортировка [#10096]
 * Напишите тесты с демонстрацией сортировки по возрастанию и убыванию. При этом:
 * создайте List<Item> с именем items, заполните произвольными данными (объектов должно быть не менее трех).
 * Далее этот список Вы отсортируете с помощью метода Collections.sort();
 * создайте List<Item> с именем expected, в нем должны быть те же данные, что и список items, но в отсортированном виде;
 * в конце теста сравниваете 2 списка - отсортированный items и expected.
 * Прим., поскольку объекты Item в обоих списках не идентичные, сравнивать нужно по значению полей
 */

class ItemDescByNameTest {

    @Test
    void whenItemDescByNameIsCorrect() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(2, "second"));
        items.add(new Item(3, "third"));
        items.add(new Item(1, "first"));
        Collections.sort(items, new ItemDescByName());

        List<Item> expected = new ArrayList<>();
        expected.add(new Item(3, "third"));
        expected.add(new Item(2, "second"));
        expected.add(new Item(1, "first"));

        assertThat(items).isEqualTo(expected);
    }
}