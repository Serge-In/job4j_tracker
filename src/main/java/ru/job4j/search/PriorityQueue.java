package ru.job4j.search;

import java.util.LinkedList;

/**
 * 2023-12-22
 * 5. Очередь с приоритетом на LinkedList [#41670]
 * Метод put(Task task) должен вставлять в нужную позицию элемент.
 * Позиция определяется по полю приоритет.
 * Для вставки использовать add(int index, E value)
 * В данном задании запрещено использовать методы get, indexOf (которые определены в реализации интерфейса List - LinkedList) по той причине,
 * что эти методы запускают цикл поиска заново. К геттерам, которые определены в модели данных Task, это ограничение не относится
 * Метод take возвращает первый элемент из списка и удаляет его. Эти действия мы делаем через метод poll().
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;

        for (Task item : tasks) {
            if (task.getPriority() < item.getPriority()) {
                  break;
            }
            index++;
        }

        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}