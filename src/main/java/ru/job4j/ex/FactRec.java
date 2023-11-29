package ru.job4j.ex;

/**
 * 2023-11-30
 * 0.6. Error - исключения, связанные с работой виртуальной машины [#219370]
 *  код вычисления факториала через рекурсию
 */
public class FactRec {
    public static int calc(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return calc(n - 1) * n;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
