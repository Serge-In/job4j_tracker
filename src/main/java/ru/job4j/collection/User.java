package ru.job4j.collection;

import java.util.Objects;

/**
 * 2024-01-07
 * 1. Организовать сортировку User [#10034]
 * 1. В этом задании нужно осуществить сортировку для модели данных ru.job4j.collection.User. В этой модели должны быть поля:
 * - name с типом String;
 * - age с типом int.
 * Класс User должен реализовать интерфейс Comparable
 * В классе User нужно реализовать метод compareTo:
 * Очень Важно!!! Метод должен сравнивать имена и в случае их равенства,
 * метод должен вернуть результат сравнения возраста. Для реализации вам понадобятся
 * - метод compareTo(), который определен в классе String для сравнения имен;
 * - метод Integer.compare(), который будет необходим для сравнения возрастов.
 * В модели User также реализованы методы equals и hashCode.
 * Они нужны для тестов, где мы используем методы сравнения моделей user.equals.
 */

public class User implements Comparable<User> {
    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User anotherUser) {
        int result = this.name.compareTo(anotherUser.name);
        return result != 0 ? result : Integer.compare(this.age, anotherUser.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
