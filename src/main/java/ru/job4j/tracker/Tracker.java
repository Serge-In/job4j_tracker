package ru.job4j.tracker;

import java.util.Arrays;

/**
 * 5. Tracker - хранилище [#396]
 * В классе Tracker должны быть методы:
 * public Item add(Item item) - добавление заявок
 * public Item[] findAll() - получение списка всех заявок
 * public Item[] findByName(String key) - получение списка по имени
 * public Item findById(int id) - получение заявки по id
 * 6. Метод замены заявки. Tracker.replace [#211748]
 * public int indexOf(int id) - поиск индекса по id заявки
 * public boolean replace(int id, Item item) - замена имени заявки без изменения индекса
 * 7. Метод удаления заявки Tracker.delete [#211749]
 * public boolean delete(int id) - удаление заявки по id с удалением пустой ячейки массива заявок
 * * 2023-04-18
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
        boolean rsl = (index != -1);
        if (rsl) {
            items[index] = item;
            items[index].setId(id);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = (index != -1);
        if (rsl) {
            int length = size - index - 1;
            System.arraycopy(items, index + 1, items, index, length);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }
}