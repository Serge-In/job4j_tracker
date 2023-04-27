package ru.job4j.concat;

/**
 * 2023-04-20
 * 13. Работа со строками. StringBuilder, StringJoiner, StringBuffer. [#504915]
 * String
 * StringBuilder
 * StringJoiner
 * String.concat()
 * String.join()
 * StringBuffer
 */
public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
/**
 * //было Миллисекунд: Asus 166, Dell 178, 162, 140
 * String str = "Job4j";
 * for (int index = 0; index < 9999; index++) {
 * str = str + index;
 * }
 */

/**
 * //стало Миллисекунд: Asus 2, Dell 3, 3, 3
 * StringBuilder str = new StringBuilder("Job4j");
 * for (int index = 0; index < 9999; index++) {
 * str.append(index);
 * }
 */

/**
 * //стало Миллисекунд: Asus 9, Dell 12, 11, 11
 *         String str = "Job4j";
 *         for (int index = 0; index < 9999; index++) {
 *             str.concat(String.valueOf(index));
 *         }
 */
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}