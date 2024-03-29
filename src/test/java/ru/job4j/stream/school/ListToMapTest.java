package ru.job4j.stream.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 2024-03-18
 * 8. Преобразование List в Map. [#110226]
 * реализовать метод, который на вход принимает список студентов List<Student>
 * и вернет результат его преобразования в Map<String, Student>, где:
 * ключ - это фамилия студента;
 * значение - объект Student (ученик).
 * Предусмотреть в реализации исключение дубликатов,
 * поскольку ключ - это фамилия, то дубликатами будут те пары, у которых совпадают фамилии студентов.
 */
class ListToMapTest {
    @Test
    void whenInputListNotHaveDuplicate() {
        List<Student> list = Arrays.asList(
                new Student(30, "Ivanov"),
                new Student(40, "Petrov"),
                new Student(50, "Sidorov")
        );
        Map<String, Student> result = ListToMap.convert(list);
        Map<String, Student> expected = new LinkedHashMap<>();
        expected.put("Ivanov", new Student(30, "Ivanov"));
        expected.put("Petrov", new Student(40, "Petrov"));
        expected.put("Sidorov", new Student(50, "Sidorov"));
        assertThat(result).containsAllEntriesOf(expected);
    }

    @Test
    void whenInputListHaveDuplicate() {
        List<Student> list = Arrays.asList(
                new Student(30, "Ivanov"),
                new Student(40, "Petrov"),
                new Student(50, "Ivanov"),
                new Student(60, "Sidorov"),
                new Student(70, "Petrov")
        );
        Map<String, Student> result = ListToMap.convert(list);
        Map<String, Student> expected = new LinkedHashMap<>();
        expected.put("Ivanov", new Student(30, "Ivanov"));
        expected.put("Petrov", new Student(40, "Petrov"));
        expected.put("Sidorov", new Student(60, "Sidorov"));
        assertThat(result).containsAllEntriesOf(expected);
    }
}