package ru.job4j.poly;
/**
 * 2023-06-10
 * 4.2. Интерфейс Input [#181092  [#181092]]
 *  создать экземпляр типа Bus
 */
public class GoHome {
    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println("Стоимость заправки = " + bus.fuel(100) + "руб.");
        bus.passengers(10);
        bus.move();
    }
}
