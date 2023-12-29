package ru.job4j.hashmap;

import java.util.List;

/**
 * 2023-12-29
 * 4. Аттестация [#504878]
 * Класс Pupil описывает ученика
 */
public record Pupil(String name, List<Subject> subjects) {
}
