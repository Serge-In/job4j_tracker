package ru.job4j.collection;

import java.util.List;

/**
 * 2023-12-22
 * 6. Конвертация ArrayList в двухмерный массив [#10035]
 * В этом задании нужно будет реализовать метод, который преобразует одномерный список List<Integer> list в двухмерный массив int[][] array
 * Число элементов в группе задается во входящем параметре int cells
 * Java есть класс Math с методом ceil, который позволяет сделать округление в большую сторону.
 * Метод сeil принимает тип double, поэтому нам нужно делимое привести к типу double, чтобы результат деления был double.
 * С другой стороны метод ceil возвращает тип double, а нам нужен тип int, поэтому и приводим его к типу int после вычисления.
 * В Java все пустые элементы массива заполняются значениями по умолчанию. То есть для типа int все элементы будут сразу заполнены 0.
 * Это дает нам возможность не заполнять хвост массива.
 *
 */

public class ConvertList2Array {

    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0;
        int cell = 0;
        for (Integer number : list) {
            array[row][cell] = number;
            cell++;
            if (cell == cells) {
                cell = 0;
                row++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] result = toArray(list, 3);
        for (int[] row : result) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}