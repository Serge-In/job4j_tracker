package ru.job4j.stream.school;

import java.util.*;
import java.util.stream.Collectors;

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
public class ListToMap {
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream()
                .collect(Collectors
                        .toMap(Student::getSurname,
                            student -> student,
                            (existing, replacement) -> existing
            ));
    }
}