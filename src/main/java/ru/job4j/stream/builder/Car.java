package ru.job4j.stream.builder;

import java.time.LocalDate;

/**
 * 2024-03-24
 * 18. Шаблоны проектирования в Stream API [#310012]
 * Вам необходимо выполнить следующее:
 * - корректно реализовать методы buildFieldName(), методы должны заполнять соответствующие поля и возвращать тип Builder;
 * - реализовать метод build(), который выполнит окончательное конструирование нашего объекта;
 * - переопределите метод toString() для класса Car;
 * - в методе main создайте еще один объект Car с помощью Builder (можете заполнять не все поля) и выводите созданный объект в консоль.
 */
public class Car {
    private String brand;

    private String model;

    private LocalDate created;

    private double volume;

    private String color;

    static class Builder {
        private String brand;
        private String model;
        private LocalDate created;
        private double volume;
        private String color;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.created = created;
            car.volume = volume;
            car.color = color;
            return car;
        }
      }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", created=").append(created);
        sb.append(", volume=").append(volume);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildBrand("Toyota")
                .buildModel("Camry")
                .buildCreated(LocalDate.of(2021, 6, 1))
                .buildVolume(2.5)
                .buildColor("Red")
                .build();
        System.out.println(car);

        Car car2 = new Builder()
                .buildBrand("Aist")
                .buildModel("Dorozhniy")
                .buildCreated(LocalDate.of(1969,  2, 4))
                .buildVolume(0.01)
                .buildColor("Green")
                .build();
        System.out.println(car2.brand + " " + car2.created);

    }
}
