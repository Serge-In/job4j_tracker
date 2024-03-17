package ru.job4j.stream;

import java.util.Objects;

/**
 * 2024-03-17
 * 4. Перенос методов в Stream API [#279131]
 * Представьте, что у нас есть продукты. Эти продукты описываются моделью Product.
 * Вашей задачей будет создать классе ProductLabel, который будет генерировать ярлыки для продуктов со скидкой.
 * Ярлык описывается следующей моделью данных Label:
 */
public class Label {
    private String name;

    private float price;

    public Label(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Label label = (Label) o;
        return Float.compare(label.price, price) == 0
                && Objects.equals(name, label.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Label{"
                + "name='" + name + '\''
                + ", price=" + price
                + '}';
    }
}
