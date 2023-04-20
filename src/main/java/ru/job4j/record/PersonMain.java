package ru.job4j.record;

import ru.job4j.tracker.ObjectInfo;

/**
 * 2023-04-19
 * 11. Record [#504880]
 * класс Person соответствует классу PersonRecord.
 * Мы видим, что объекты обоих классов напечатались корректно,
 * то есть record содержит и указанные нами поля name и age, и конструктор для создания объекта со всеми полями,
 * и геттеры для каждого поля. В конце мы создаем еще один record с теми же полями и значениями и сравниваем их,
 * в результате чего получаем true, то есть hashcode и equals в record тоже переопределены.
 */
public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Иван", 30);
        PersonRecord record = new PersonRecord("Иван", 30);
        PersonRecord record1 = new PersonRecord("Иван", 30);
        ObjectInfo.compare2("compare2(person, record)", person, record);
        ObjectInfo.compare2("compare2(record, record1)", record, record1);
    }
}
