package ru.job4j.inheritance;

/**
 * Демонстрация сокрытия в дочернем классе статического класса из родительского класса
 * https://www.youtube.com/watch?v=egC9I866MQ0
 * 2023-04-11
 */
public class Cat extends Animal {
    public static void testClassMethod(String invokeMethodName) {
        System.out.println(invokeMethodName + ": The static method in Cat"); }

    public void testInstanceMethod(String invokeMethodName) {
        System.out.println(invokeMethodName + ": The instance method in Cat"); }

    public static void main(String[] args) {
        Cat.testClassMethod("Cat.testClassMethod");
        Cat myCat = new Cat();
        myCat.testClassMethod("myCat.testClassMethod");
        myCat.testInstanceMethod("myCat.testInstanceMethod");
        System.out.println("");

        Animal.testClassMethod("Animal.testClassMethod");
        Animal myAnimal1 = new Animal();
        myAnimal1.testClassMethod("myAnimal1.testClassMethod");
        myAnimal1.testInstanceMethod("myAnimal1.testInstanceMethod");
        System.out.println("");

        Animal myAnimal2 = myCat;
        myAnimal2.testClassMethod("myAnimal2.testClassMethod");
        myAnimal2.testInstanceMethod("myAnimal2.testInstanceMethod");
        System.out.println("");
    }
}
