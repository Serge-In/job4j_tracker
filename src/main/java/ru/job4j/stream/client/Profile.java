package ru.job4j.stream.client;

/**
 * 2024-03-18
 * 6. Список адресов [#110062]
 */
public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}