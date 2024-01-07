package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2024-01-07
 * 2. Комбинированный компаратор [#10036]
 * 1. Для модели ru.job4j.collection.Job создайте 4 компаратора:
 *  - по возрастанию приоритета;
 *  Integer.compare(job1.getPriority() = 1, job2.getPriority() = 2) = -1
 *  Integer.compare(job1.getPriority() = 3, job2.getPriority() = 2) = 1
 */

public class JobAscByPriority implements Comparator<Job> {
    @Override
    public int compare(Job job1, Job job2) {
        return  Integer.compare(job1.getPriority(), job2.getPriority());
    }
}