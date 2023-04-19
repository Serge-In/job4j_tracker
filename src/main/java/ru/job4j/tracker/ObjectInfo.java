package ru.job4j.tracker;

/**
 * 2023-04-19
 * 1. public static void info(String message, Object object)
 *      вывод в консоль message, данных объекта: класс, все поля и значения, хеш-код
 * 2. public static void compare2(String message, Object object1, Object object2)
 *      вывод в консоль message, object1.equals(object2)
 */
public class ObjectInfo {
    public static void info(String message, Object object) {
        System.out.println(message + "\n\tObjectInfo.info(object) :");
        System.out.println("\t\t.getClass() = " + object.getClass());
        System.out.println("\t\t.toString() = " + object.toString());
        System.out.println("\t\t.hashCode() = " + object.hashCode());
        System.out.println();
    }

    public static void compare2(String message, Object object1, Object object2) {
        System.out.println(message + "\n\tObjectInfo.compare(object1, object2) :");
        System.out.println("\t\tobject1.equals(object2) = " + object1.equals(object2));
        System.out.println();
    }
}
