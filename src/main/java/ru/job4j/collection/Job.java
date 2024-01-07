package ru.job4j.collection;

/**
 * 2024-01-07
 * 2. Комбинированный компаратор [#10036]
 * 1. Для модели ru.job4j.collection.Job создайте 4 компаратора:
 *  - по возрастанию имени;
 *  - по возрастанию приоритета;
 *  - по убыванию имени;
 *  - по убыванию приоритета.
 */
public class Job implements Comparable<Job> {
    private String name;

    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + name + ", " + priority + '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
}
