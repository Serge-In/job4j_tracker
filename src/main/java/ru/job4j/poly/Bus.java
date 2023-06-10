package ru.job4j.poly;
/**
 * 2023-06-10
 * 4.2. Интерфейс Input [#181092  [#181092]]
 *  Реализуйте интерфейс Transport  в классе ru.job4j.poly.Bus.
 */
public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int passengersNumber) {
        System.out.println("Число пассажиров = " + passengersNumber);
    }
}
