package ru.job4j.stream.school;

import java.util.List;
import java.util.function.Predicate;

/**
 * 2024-03-18
 * 5. Фильтрация учеников [#110058]
 */
public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .toList();
    }
}