package ru.job4j.poly;

/**
 * 2023-06-10
 * 4.2. Интерфейс Input [#181092  [#181092]]
 *  Создайте интерфейс транспорт ru.job4j.poly.Transport;
 *  В интерфейсе объявите три метода:
 *  ехать (без параметров, без возвращаемого типа),
 *  пассажиры (принимает число пассажиров, без возвращаемого типа),
 *  заправить (принимает кол-во топлива, возвращает цену).
 */
public interface Transport {
    void move();

    void passengers(int passengersNumber);

    default double fuel(int fuelLitres) {
        return fuelLitres * 60;
    }
}
