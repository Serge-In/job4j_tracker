package ru.job4j.varargs;

/**
 * 2023-04-20
 * 15. Аргументы переменной длины (varargs) [#504977]
 * Аргументы переменной длины объявляются в коде в виде троеточия "..." между типом данных и именем.
 * Данная запись подразумевает 0 и более аргументов.
 * Аргумент strings неявно будет преобразован в массив строк.
 */
public class VarArgs {
//Параметр strings в методе text() неявно будет приведён к массиву при передаче аргументов.
    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
        //return builder.toString();

        //Количество переданных в varargs аргументов можно узнать с помощью метода length:
        return builder + " Количество соединенных элементов: " + strings.length;
    }

    public static void main(String[] args) {

        //В методе main() в качестве этого параметра мы передаём список аргументов через запятую.
        System.out.println(text()); //Количество соединенных элементов: 0
        System.out.println(text("aaa"));
        System.out.println(text("aaa", "bbb", "ccc")); //aaabbbccc Количество соединенных элементов: 3
        System.out.println(text("aaa", "bbb", "ccc", "ddd", "eee"));
    }

}
