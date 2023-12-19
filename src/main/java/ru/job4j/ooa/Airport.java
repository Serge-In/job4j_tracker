package ru.job4j.ooa;
/**
 * 2023-12-19
 * 3. final [#334073]
 *  1. Ниже представлен код, он содержит ряд ошибок компиляции. Вам необходимо его исправить.
 *  Нужно выполнить следующее:
 * - сделать так, чтобы от класса Airbus нельзя было наследоваться.
 * - реализовать метод printCountEngine().
 * если модель самолета A380 - количество двигателей должно равняться 4,
 * для всех остальных моделей - используем в качестве значения константу COUNT_ENGINE.
 * Чтобы не допускать дублирования кода следует использовать дополнительную переменную
 * и тернарный оператор.
 * Код метода должен уместиться на двух строках.
 */
public class Airport {
    public static void main(String[] args) {
        Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        airbus = new Airbus("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        airbus.setName("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

    }
}