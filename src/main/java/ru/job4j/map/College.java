package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * 2024-03-28
 * 3. Optional - empty, of [#214711 #488467]
 * Обратите внимание - методы поиска в классе College могут вернуть null.
 * Ваша задача - переписать этим методы, чтобы они возвращали тип Optional,
 * по умолчанию нужно возвращать Optional.empty().
 */
public class College {

    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(obj -> obj.account().equals(account))
                .findFirst();
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
            return findByAccount(account)
                .flatMap(student -> students.get(student)
                    .stream()
                        .filter(subject -> subject.name().equals(name))
                        .findFirst());
    }
}
