package ru.job4j.tracker;

/**
 * 2023-12-20
 * 1. Singleton [#94606]
 * Создайте класс ru.job4j.tracker.SingleTracker. Этот класс должен реализовывать шаблон singleton.
 * Этот класс должен реализовывать все методы от класса Tracker.
 * Внутри класса SingleTracker используется объект Tracker. Это позволяет использовать поведения класса Tracker в классе SingleTracker.
 * 2. Реализуйте singleton и добавьте недостающие методы
 * Для этого:
 * Создать явно конструктор и указать у него модификатор private. Таким образом, никто не сможет создать объект этого класса.
 *  нужно запретить наследование этого класса. Для этого используем ключевое слово final. --> public final class SingleTracker
 * добавим public static метод, чтобы другие классы могли получить ссылку на объект --> public static SingleTracker getInstance()
 */
public final class SingleTracker {
    private static SingleTracker instance = null;
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
          return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
         return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}