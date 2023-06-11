package ru.job4j.cast;
/**
 * 2023-06-11
 * 5.1. Зачем нужно приведение типов [#310019  [#310019]]
 * Добавьте интерфейс Транспортное средство (Vehicle), определите в нем метод без возвращаемого типа move()
 * Добавьте три реализации - Самолет, Поезд, Автобус. В каждом реализуйте метод move()
 * Создайте несколько объектов каждого класса, при этом приведите их к типу Vehicle.
 * Сложите все объекты в массив, а потом в цикле for() выведите все объекты в консоль с вызовом их методов;
 */
public class Transport {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] transports = new Vehicle[] {plane, train, bus};
        for (Vehicle tr : transports) {
            System.out.println("Класс: " + tr.getClass().getName());
            tr.move();
        }
    }
}
