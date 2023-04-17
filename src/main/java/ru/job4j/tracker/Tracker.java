package ru.job4j.tracker;

import java.util.Arrays;

/**
 * 5. Tracker - хранилище [#396]
 * В классе Tracker должны быть методы:
 * добавление заявок - public Item add(Item item);
 * получение списка всех заявок - public Item[] findAll();
 * получение списка по имени - public Item[] findByName(String key);
 * получение заявки по id - public Item findById(int id);
 * 2023-04-17
 */
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsNotNull = new Item[items.length];
        int size = 0;
        for (Item item : items) {
            if (item != null) {
                itemsNotNull[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsNotNull, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsMatchKey = new Item[items.length];
        int size = 0;
        for (Item item : items) {
            if (item.getName() == key) {
                itemsMatchKey[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsMatchKey, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}