package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {

    @Test
    void whenItemAscByNameIsCorrect() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(2, "second"));
        items.add(new Item(3, "third"));
        items.add(new Item(1, "first"));
        Collections.sort(items, new ItemAscByName());

        List<Item> expected = new ArrayList<>();
        expected.add(new Item(4, "first"));
        expected.add(new Item(5, "second"));
        expected.add(new Item(6, "third"));

//        assertThat(items.get(0).getName()).isEqualTo(expected.get(0).getName());
//        assertThat(items.get(1).getName()).isEqualTo(expected.get(1).getName());
//        assertThat(items.get(2).getName()).isEqualTo(expected.get(2).getName());
        assertThat(items).isEqualTo(expected);
    }
}