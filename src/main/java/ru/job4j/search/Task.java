package ru.job4j.search;

/**
 * 2023-12-22
 * 5. Очередь с приоритетом на LinkedList [#41670]
 */
public class Task {
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
