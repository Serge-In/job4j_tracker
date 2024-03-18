package ru.job4j.stream.client;

import java.util.Objects;

/**
 * 2024-03-18
 * 6. Список адресов [#110062]
 * 7. Уникальность элементов и сортировка. [#110225]
 * В данной задаче требуется доработать функционал из задания "Список адресов".
 * Для этого необходимо: - в класс Address добавить геттер для поля city
 */
public class Address {
    private String city;

    private String street;

    private int home;

    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return home == address.home
                && apartment == address.apartment
                && Objects.equals(city, address.city)
                && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }
}