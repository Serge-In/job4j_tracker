package ru.job4j.io;
/*Т.к. мы собираемся использовать объект класса Scanner, нам нужно сперва импортировать этот класс.*/
import java.util.Scanner;
/**
 * 2023-04-21
 * 2.0. Чтение из консоли. Класс Scanner. [#179514]
 */
public class Greeting {
    public static void main(String[] args) {
        /*Далее, нужно создать объект Scanner.
         На данном этапе просто запомните конструкцию создания объекта Scanner.
         Он принимает в качестве параметра объект "System.in".*/
        Scanner input = new Scanner(System.in);

        System.out.print("Добро пожаловать. Как Вас зовут? _____");

        /*У объекта Scanner есть метод nextLine(), который считывает все символы строки после нажатия на клавишу Enter.
        После того, как пользователь нажал кнопку Enter,
        программа записывает введенные символы в переменную и продолжает выполнение программы.*/

        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть!");
    }
}