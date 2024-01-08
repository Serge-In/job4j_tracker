package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель пользователя банка User
 * Эта модель содержит поля: номер паспорта и ФИО
 */
public class User {
    /**
     * Поле номер паспорта
     */
    private String passport;

    /**
     * Поле Имя пользователя
     */
    private String username;

    /**
     * Конструктор
     * @param passport Номер паспорта
     * @param username Имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}

