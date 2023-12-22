package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 2023-12-22
 * 7. Конвертация двумерного массива в ArrayList [#48580]
 * В этом задании необходимо реализовать обратную конвертацию двухмерного массива в одномерный список.
 */

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}