package ru.job4j.collection;

/**
 * 2023-12-23
 * 1. Уникальные задачи. [#212653]
 */
public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

}
