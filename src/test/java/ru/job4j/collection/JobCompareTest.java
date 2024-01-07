package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 2024-01-07
 * Комбинированный компаратор [#10036]
 * 1. Для модели ru.job4j.collection.Job создайте 4 компаратора:
 * - по возрастанию имени;
 * - по возрастанию приоритета;
 * - по убыванию имени;
 * - по убыванию приоритета.
 * 2. Напишите тесты, проверяющие отдельно поведение компараторов.
 * 3. Напишите тесты, проверяющие поведение комбинированных компараторов.
 */

class JobCompareTest {

    @Test
    void whenComparatorAscByNameIsTrue() {
        int rsl = new JobAscByName().compare(
                new Job("first", 1),
                new Job("second", 3)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    void whenComparatorDescByNameIsTrue() {
        int rsl = new JobDescByName().compare(
                new Job("first", 1),
                new Job("second", 3)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    void whenComparatorAscByPriorityIsTrue() {
        int rsl = new JobAscByPriority().compare(
                new Job("first", 1),
                new Job("second", 3)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    void whenComparatorDescByPriorityIsTrue() {
        int rsl = new JobDescByPriority().compare(
                new Job("first", 1),
                new Job("second", 3)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    void whenComparatorDescByPriorityAscByNameIsTrue() {
        Comparator<Job> jobDescByPriorityAscByName =
                new JobDescByPriority().thenComparing(
                        new JobAscByName()
                );
        int rsl1 = jobDescByPriorityAscByName.compare(
                new Job("first", 1),
                new Job("second", 2)
        );
        assertThat(rsl1).isGreaterThan(0);

        int rsl2 = jobDescByPriorityAscByName.compare(
                new Job("first", 1),
                new Job("first", 1)
        );
        assertThat(rsl2).isEqualTo(0);

        int rsl3 = jobDescByPriorityAscByName.compare(
                new Job("first", 1),
                new Job("second", 1)
        );
        assertThat(rsl3).isLessThan(0);

        int rsl4 = jobDescByPriorityAscByName.compare(
                new Job("second", 1),
                new Job("first", 1)
        );
        assertThat(rsl4).isGreaterThan(0);
    }
}