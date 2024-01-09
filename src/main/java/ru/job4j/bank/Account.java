package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель данных банковский счет Пользователя
 */
public class Account {
    /**
     * Номер банковского счета
     */
    private String requisite;

    /**
     * Сумма начального баланса в валюте счета
     */
    private double balance;

    /**
     * Конструктор
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Получить номер банковского счета
     * @return Номер банковского счета
     */
    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
