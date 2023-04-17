package ru.job4j.oop;

/**
 * javarush.com
 * Вызов конструктора из конструктора
 * 2023-04-11
 */
public class SomeClass {
    int a;
    int b;
    int c;

    public SomeClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Вызов конструктора с двумя параметрами.
     */
    public SomeClass(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

    public void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}