package ru.job4j.poly;

/**
 * 2023-04-20
 * 1. Что такое полиморфизм. [#3819]
 * 1) Напишем класс Service, который использует наше хранилище.
 * Представьте, что другой программист открыл класс Service.
 * Для него будет ясно, что сервис записывает данные в файл,
 * потому что в коде класс Service хранит состояние в поле FileStore
 */
public class Service1 {
    private FileStore1 store;

    public Service1(FileStore1 store) {
        this.store = store;
    }

    public void add() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        FileStore1 store = new FileStore1();
        Service1 service = new Service1(store);
        service.add();
    }
}