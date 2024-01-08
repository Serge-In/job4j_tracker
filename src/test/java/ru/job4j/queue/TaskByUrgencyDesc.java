package ru.job4j.queue;

import java.util.Comparator;

/**
 * 2024-01-08
 * 5. PriorityQueue [#504944]
 * Ваша задача будет реализовать класс ScheduleTask
 * Для корректной работы Вам необходимо реализовать 2 компаратора:
 * TaskByUrgencyDesc - сортирует по полю urgency в обратном порядке,
 * т.е. чем больше число, тем ближе к началу оно должно находиться.
 */

public class TaskByUrgencyDesc implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return Integer.compare(o2.urgency(), o1.urgency());
    }
}