package ru.job4j.datetime;

import java.time.LocalDate;

/**
 * Класс LocalDate из пакета java.time предназначен для работы с датами.
 * Функционал этого класса позволяет создавать даты и изменять их,
 * добавляя и отнимая необходимое количество дней/месяцев/лет.
 */
public class JavaTimeLocalDate {
    public static void main(String[] args) {
        //static LocalDate now(): возвращает объект, который представляет текущую дату

        // static LocalDate.of(int year, int month, int dayOfMonth) 
        // Obtains an instance of LocalDate from a year, month and day.
        LocalDate localDate = LocalDate.of(2023, 4, 16);
        System.out.println("localDate = " + localDate); //localDate = 2023-04-16
        System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek()); //localDate.getDayOfWeek() = SUNDAY

        //Field Details
        //public static final LocalDate MIN
        //The minimum supported LocalDate, '-999999999-01-01'. This could be used by an application as a "far past" date.
        //public static final LocalDate MAX
        //The maximum supported LocalDate, '+999999999-12-31'. This could be used by an application as a "far future" date.
        //public static final LocalDate EPOCH
        //The epoch year LocalDate, '1970-01-01'.

    }
}
