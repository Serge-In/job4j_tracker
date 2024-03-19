package ru.job4j.stream.client;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2024-03-18
 * 6. Список адресов [#110062]
 * В туристической компании появилась задача составить список адресов клиентов.
 * В анкете у клиента, есть адрес проживания.
 * Создать класс Profiles, в котором определить метод, который позволит преобразовать список профилей в список адресов.
 * Для реализации Вам понадобятся методы: stream(), map() и collect().
 * 7. Уникальность элементов и сортировка. [#110225]
 * В данной задаче требуется доработать функционал из задания "Список адресов".
 * в класс Profiles добавить следующий метод: collectSortWithoutDuplicate
 * Ваша задача реализовать этот метод таким образом, чтобы он:
 * - отсортировал результирующий список в порядке возрастания по полю String city;
 * - исключил дубликаты.
 * При этом учтите следующее:
 * - сортировать лучше прежде чем исключать дубликаты, т.к. после сортировки дубликаты будут скапливаться в начале, что облегчит их поиск,
 * а также ускорит работу программы;
 * - сортировать надо с помощью метода sorted(Comparator<Address> comparator);
 * - чтобы оставить только уникальные элементы, нужно использовать метод Stream#distinct().
 */
public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        Comparator<Address> comparator = Comparator.comparing(Address::getCity);
        return profiles
                .stream()
                .map(Profile::getAddress)
                .sorted(comparator)
                .distinct()
                .collect(Collectors.toList());
    }
}