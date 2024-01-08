package ru.job4j.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 2024-01-08
 * 5. PriorityQueue [#504944]
 * Ваша задача будет реализовать класс ScheduleTask
 * - addTask() просто добавляет переданную задачу в очередь;
 * - readTask() просто читает элемент из головы очереди без удаления;
 * - getTask() просто возвращает задачу из головы очереди с удалением.
 * Если очередь пуста – реализация не должна генерировать исключений.
 * Для корректной работы Вам необходимо реализовать 2 компаратора:
 * TaskByPositionAsc - сортирует по полю position по возрастанию, у Enum уже реализован метод compareTo()
 * TaskByUrgencyDesc - сортирует по полю urgency в обратном порядке, т.е. чем больше число, тем ближе к началу оно должно находиться.
 *
 */

public class ScheduleTask {
    private PriorityQueue<Task> queue;

    public ScheduleTask(Comparator<Task> comparator) {
        this.queue = new PriorityQueue<>(comparator);
    }

    public void addTask(Task task) {
        queue.add(task);
    }

    public Task readTask() {
        return queue.peek();
    }

    public Task getTask() {
        return queue.poll();
    }
}
