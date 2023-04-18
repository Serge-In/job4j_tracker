package ru.job4j.tracker;

import java.util.Arrays;

/**
 * 5. Tracker - хранилище [#396]
 * В классе Tracker должны быть методы:
 * добавление заявок - public Item add(Item item);
 * получение списка всех заявок - public Item[] findAll();
 * получение списка по имени - public Item[] findByName(String key);
 * получение заявки по id - public Item findById(int id);
 * 6. Метод замены заявки. Tracker.replace [#211748]
 * int indexOf(int id) - поиск индекса по id заявки
 * <p>
 * 2023-04-18
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
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsMatchKey = new Item[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                itemsMatchKey[counter] = items[i];
                counter++;
            }
        }
        return Arrays.copyOf(itemsMatchKey, counter);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            String newName = item.getName();
            items[index].setName(newName);
            return true;
        }
        return false;
    }
}