package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2024-01-07
 * 2. Комбинированный компаратор [#10036]
 * 1. Для модели ru.job4j.collection.Job создайте 4 компаратора:
 *  - по убыванию имени;
 */

public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job job1, Job job2) {
        return  job2.getName().compareTo(job1.getName());
    }
}
