package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {

    @Test
    void compare() {
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(1, "first"));
        expected.add(new Item(2, "second"));
        expected.add(new Item(3, "third"));

        List<Item> items = new ArrayList<>();
        items.add(expected.get(1));
        items.add(expected.get(2));
        items.add(expected.get(0));

        Collections.sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }
}