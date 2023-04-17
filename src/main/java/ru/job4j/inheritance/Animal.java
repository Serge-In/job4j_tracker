package ru.job4j.inheritance;

public class Animal {
    public static void testClassMethod(String invokeMethodName) {
        System.out.println(invokeMethodName + ": The static method in Animal");
    }

    public void testInstanceMethod(String invokeMethodName) {
        System.out.println(invokeMethodName + ": The instance method in Animal");
    }
}