package ru.job4j.poly;

public class FileStore1 {
    private String path;

    public FileStore1() { }

    public FileStore1(String path) {
        this.path = path;
    }

    public void save(String data) {
        /*Тут реализация хранения данных в файле*/
    }

    public String read() {
        /* Тут чтение файла*/
        return null;
    }
}