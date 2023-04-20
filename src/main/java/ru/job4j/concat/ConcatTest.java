package ru.job4j.concat;

/**
 * 2023-04-20
 * 13. Работа со строками. StringBuilder, StringJoiner, StringBuffer. [#504915]
 * //        String
 * //        StringBuilder
 * //        StringJoiner
 * //        String.concat()
 * //        String.join()
 * //        StringBuffer
 */
public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // было Миллисекунд: 166
//        String str = "Job4j";
//        for (int index = 0; index < 9999; index++) {
//            str = str + index;
//        }

        // стало Миллисекунд: 2
//        StringBuilder str = new StringBuilder("Job4j");
//        for (int index = 0; index < 9999; index++) {
//            str.append(index);
//        }

        // стало Миллисекунд: 9
//        String str = "Job4j";
//        for (int index = 0; index < 9999; index++) {
//            str.concat(String.valueOf(index));
//        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}