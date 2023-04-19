package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 2023-04-15
 * 8. Date. Отображение даты. [#310017]
 * Добавьте класс StartUI, в нем создайте один объект Item.
 * На этом объекте вызовите геттер поля created, выведите полученную дату в консоль в отформатированном варианте
 * 2023-04-19
 * 10. toString [#310018]
 * Создайте класс StartUI, в котором создайте 1 объект класса Item, выведите созданный объект в консоль.
 */
public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime itemCreatedDT = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String itemCreatedDTFormatted = itemCreatedDT.format(formatter);
        System.out.println("itemCreatedDTFormatted = " + itemCreatedDTFormatted);
        System.out.println("item = " + item);
    }
}