package ru.job4j.collection;

import java.util.Objects;

/**
 * 2023-12-26
 * 2. Преобразования List в Map. [#10093]
 * нужно преобразовать одну коллекцию в другую
 * модель данных Order с полями number, name
 * в систему поступает список заказов. Нам было бы удобно работать с ним по номеру.
 * Для этого нужно преобразовать список заявок в карту
 * В качестве ключа установить поле number.
 *
 */
public class Order {
    private String number;
    private String name;

    public Order(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Order{"
                + "number='" + number + '\''
                + ", name='" + name + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(number, order.number)
                && Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
