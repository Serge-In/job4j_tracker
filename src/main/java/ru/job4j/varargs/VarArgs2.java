package ru.job4j.varargs;

/**
 *  Параметр varargs всегда должен быть объявлен последним среди всех параметров метода,
 *  а также он должен быть единственным. Нельзя объявить 2 параметра varargs в сигнатуре одного и того же метода
 */
public class VarArgs2 {
    /*В методе с аргументами произвольной длины можно задавать и обычные параметры помимо произвольных*/
    public static String text(int x, String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
        return String.valueOf(x) + ", " + builder + " Количество соединенных элементов: " + strings.length;
    }

/* Методы с аргументами произвольной длины можно перегружать.*/
    public static String text(int x, int y, String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
        return String.valueOf(x) + ", " + String.valueOf(y) + ", " + builder + " Количество соединенных элементов: " + strings.length;
    }

    /* Перегружать методы с аргументами произвольной длины можно и вариантом без применения varargs:*/
    public static String text(int x, int y, String str) {
        return String.valueOf(x) + ", " + str;
    }

    public static void main(String[] args) {

        /*В методе main() в качестве этого параметра мы передаём список аргументов через запятую.*/
        System.out.println(text(1)); /*Количество соединенных элементов: 0*/
        System.out.println(text(1, "aaa"));
        System.out.println(text(1, 2, "aaa", "bbb", "ccc")); /*aaabbbccc Количество соединенных элементов: 3*/
        System.out.println(text(1, 2, "aaa")); /* 1, aaa*/
    }
}