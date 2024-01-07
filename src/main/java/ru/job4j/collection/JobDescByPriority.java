package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2024-01-07
 * 2. Комбинированный компаратор [#10036]
 * 1. Для модели ru.job4j.collection.Job создайте 4 компаратора:
 *  - по убыванию приоритета.
 *  Integer.compare(job2.getPriority() = 2, job1.getPriority() = 1) = 1
 *  Integer.compare(job2getPriority() = 2, job1.getPriority() = 3) = -1
 */

public class JobDescByPriority  implements Comparator<Job> {
    @Override
    public int compare(Job job1, Job job2) {
        return  Integer.compare(job2.getPriority(), job1.getPriority());
    }
}
