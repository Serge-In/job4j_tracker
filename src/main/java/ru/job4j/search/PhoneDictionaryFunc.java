package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 2024-03-13
 * 7. Функции высшего порядка [#24255]
 * Есть список абонентов. Нужно их отфильтровать по ключу
 * Метод поиска должен фильтровать все поля модели. Если изменится модель, то нам нужно будет дописать условия.
 * Допишите метод find с использованием функции высшего порядка
 */
public class PhoneDictionaryFunc {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = (person) -> person.getName().contains(key);
        Predicate<Person> surname = (person) -> person.getSurname().contains(key);
        Predicate<Person> phone = (person) -> person.getPhone().contains(key);
        Predicate<Person> address = (person) -> person.getAddress().contains(key);

        Predicate<Person> combine = name.or(surname).or(phone).or(address);

        return new ArrayList<>(persons.stream().filter(combine).toList());
    }
}