package ru.job4j.stream.client;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2024-03-18
 * 6. Список адресов [#110062]
 * В туристической компании появилась задача составить список адресов клиентов.
 * В анкете у клиента, есть адрес проживания.
 * Создать класс Profiles, в котором определить метод, который позволит преобразовать список профилей в список адресов.
 * Для реализации Вам понадобятся методы: stream(), map() и collect().
 */
public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}