package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

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
 * 2023-12-23
 * 9. Изменить программу Tracker из 2-го модуля [#10039]
 * Замените массив на коллекцию java.util.ArrayList в проекте Tracker.
 * Лучшей практикой считается взаимодействие через интерфейсы, а не через конкретные реализации,
 * что позволяет использовать все преимущества полиморфизма.
 * Нужно, чтоб items была ссылкой типа List<Item>
 * Методы должны возвращать и принимать List<Item>
 */
public class Tracker {
    public final List<Item> items = new ArrayList<>() {
    };
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        items.add(item);
        item.setId(ids++);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> itemsMatchKey = new ArrayList<>() {
        };
        int counter = 0;
        for (Item item : items) {
            if (key.equals(item.getName())) {
                itemsMatchKey.add(item);
            }
        }
        return itemsMatchKey;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = (index != -1);
        if (rsl) {
            item.setId(id);
            items.add(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = (index != -1);
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }
}