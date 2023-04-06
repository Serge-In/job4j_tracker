package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point anotherPoint) {
        return sqrt(pow(this.x - anotherPoint.x, 2) + pow(this.y - anotherPoint.y, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double rsl = point1.distance(point2);
        System.out.println("rsl (0, 0) to (2, 0) " + rsl);
    }
}