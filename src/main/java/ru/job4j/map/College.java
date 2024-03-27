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
        Optional<Student> student = Optional.empty();
        student = students.keySet()
                .stream()
                .filter(obj -> obj.account().equals(account))
                .findFirst();
        return student;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> student = findByAccount(account);
        Optional<Subject> subject = Optional.empty();
        if (student.isPresent()) {
            subject = students.get(student.get())
                    .stream()
                    .filter(obj -> obj.name().equals(name))
                    .findFirst();
        }
        return subject;
    }
}
