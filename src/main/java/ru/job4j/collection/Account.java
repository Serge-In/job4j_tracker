package ru.job4j.collection;

import java.util.Objects;

/**
 * 2023-12-25
 * 3. Модели данных и HashSet. [#218530]
 *  создадим модель данных - клиент банка. ru.job4j.collection.Account.
 *  В этой модели будут поля: серия и номер паспорта, ФИО, номер счета.
 *  для вычисления equals и hashCode тут используется только одно поле - это серия и номер паспорта.
 *
 */
public class Account {
    private String passport;
    private String username;
    private String deposit;

    public Account(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(passport, account.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "Account{"
                + "passport='" + passport + '\''
                + ", username='" + username + '\''
                + ", deposit='" + deposit + '\''
                + '}';
    }
}