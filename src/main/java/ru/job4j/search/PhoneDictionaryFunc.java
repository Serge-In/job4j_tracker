package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.BiPredicate;

/**
 * 2024-03-13
 * 7. Функции высшего порядка [#24255]
 * Есть список абонентов. Нужно их отфильтровать по ключу
 * Метод поиска должен фильтровать все поля модели. Если изменится модель, то нам нужно будет дописать условия.
 * Допишите метод find с использованием функции высшего порядка
 */
public class PhoneDictionaryFunc {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        BiPredicate<String, Person> name = (x, y) -> x.equals(y.getName());
        BiPredicate<String, Person> surname = (x, y) -> x.equals(y.getSurname());
        BiPredicate<String, Person> phone = (x, y) -> x.equals(y.getPhone());
        BiPredicate<String, Person> address = (x, y) -> x.equals(y.getAddress());
        BiPredicate<String, Person> combine = name.or(surname).or(phone).or(address);

        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(key, person)) {
                result.add(person);
            }
        }
        return result;
    }
}