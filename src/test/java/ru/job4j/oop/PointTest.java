package ru.job4j.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void distanceTest2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        double exp = 2.0;
        double result = point1.distance(point2);
        double eps = 0.0001;
        Assertions.assertEquals(exp, result, eps);
    }

    @Test
    void distance3dTest1() {
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(0, 2, 2);
        double exp = 2.8284;
        double result = point1.distance3d(point2);
        double eps = 0.0001;
        Assertions.assertEquals(exp, result, eps);
    }

    @Test
    void distance3dTest2() {
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(2, 2, 2);
        double exp = 3.4641;
        double result = point1.distance3d(point2);
        double eps = 0.0001;
        Assertions.assertEquals(exp, result, eps);
    }
}