package ru.job4j.queue;

import java.util.Comparator;

/**
 * 2024-01-08
 * 5. PriorityQueue [#504944]
 * Ваша задача будет реализовать класс ScheduleTask
 * Для корректной работы Вам необходимо реализовать 2 компаратора:
 * TaskByPositionAsc - сортирует по полю position по возрастанию, у Enum уже реализован метод compareTo()
 */

public class TaskByPositionAsc implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.position().compareTo(o2.position());
    }
}
