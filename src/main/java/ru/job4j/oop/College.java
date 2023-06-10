package ru.job4j.oop;
/**
 * 2023-06-10
 * 5.0. Приведение типов. Повышение типа и понижение типа. [#181322  [#181322]]
 * Создайте класс ru.job4j.oop.College с методом main
 * сделайте приведение объекта Freshman к Student, а потом к Object.
 */
public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student2 student2 = freshman;
        Object obj = student2;
    }
}
