package ru.job4j.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void whenX1Y2X2Y3X3Y4ThenMinus1() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 3);
        Point point3 = new Point(3, 4);
        Triangle triangle = new Triangle(point1, point2, point3);
        double result = triangle.area();
        double exp = -1;
        double eps = 0.01;
        Assertions.assertEquals(exp, result, eps);
    }

    @Test
    public void whenX3Y2X6Y5X6Y2ThenArea4point5() {
        Point point1 = new Point(3, 2);
        Point point2 = new Point(6, 5);
        Point point3 = new Point(6, 2);
        Triangle triangle = new Triangle(point1, point2, point3);
        double result = triangle.area();
        double exp = 4.5;
        double eps = 0.01;
        Assertions.assertEquals(exp, result, eps);
    }
}