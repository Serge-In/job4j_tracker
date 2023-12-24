package ru.job4j.collection;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

/**
 * 2023-12-23
 * 1. Уникальные задачи. [#212653]
 * 1. Реализуйте метод ru.job4j.collection.FullSearch.extractNumber.
 * Вам нужно убрать дубликаты из списка.
 */

public class FullSearch {

    public Set<String> extractNumber(List<Task> tasks) {
        Set<Task> uniqueTasks = new HashSet<>(tasks);
        Set<String> uniqueNumbers = new HashSet<>();

        for (Task uniqueTask : uniqueTasks) {
            uniqueNumbers.add(uniqueTask.getNumber());
        }
        return uniqueNumbers;
    }
}