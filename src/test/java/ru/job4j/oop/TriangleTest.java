package ru.job4j.oop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void whenAB1BC1CA2ThenMinus1() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 3);
        Point point3 = new Point(3, 4);
        Triangle triangle = new Triangle(point1, point2, point3);
        double result = triangle.area();
        double exp = -1;
        double eps = 0.01;
        Assert.assertEquals(exp, result, eps);
    }

    @Test
    public void whenAB2BC2CA2ThenArea1point7320() {
        Point point1 = new Point(3, 2);
        Point point2 = new Point(6, 5);
        Point point3 = new Point(6, 2);
        Triangle triangle = new Triangle(point1, point2, point3);
        double result = triangle.area();
        double exp = 4.5;
        double eps = 0.01;
        Assert.assertEquals(exp, result, eps);
    }
}