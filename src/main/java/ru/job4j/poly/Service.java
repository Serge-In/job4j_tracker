package ru.job4j.poly;

/**
 * 2023-04-20
 * 1. Что такое полиморфизм. [#3819]
 * Теперь класс Service связан с описанием хранилище,
 * но не с его реализацией. Другой программист будет понимать,
 * что детали реализации нужно искать в месте создания объекта Service.
 */

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        FileStore store = new FileStore();
        /*      MemStore store = new MemStore();    */
        Service service = new Service(store);
        service.add();
    }
}