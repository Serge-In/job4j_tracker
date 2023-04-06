package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * 4. Класс для расчета расстояние между точками в дву- и трех- мерном пространстве. [#122643]
 * метод distance для расчета расстояния между 2мя точками, заданными двумя координатами x, y
 * метод distance3d для расчета расстояния между 2мя точками, заданными тремя координатами x, y, z
 * 2023-04-06
 */
public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point anotherPoint) {
        return sqrt(pow(this.x - anotherPoint.x, 2) + pow(this.y - anotherPoint.y, 2));
    }

    public double distance3d(Point anotherPoint) {
        return sqrt(pow(this.x - anotherPoint.x, 2) + pow(this.y - anotherPoint.y, 2) + pow(this.z - anotherPoint.z, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double rsl = point1.distance(point2);
        System.out.println("rsl (0, 0) to (2, 0) " + rsl);
    }
}