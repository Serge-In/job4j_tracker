package ru.job4j.oop;

public class Triangle {
    private Point point1, point2, point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double semiPerimeter(double side1, double side2, double side3) {
        return (side1 + side2 + side3) / 2;
    }

    public boolean isExist(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
    }

    public double area() {
        double result = -1;
        double side1 = point1.distance(point2);
        double side2 = point2.distance(point3);
        double side3 = point3.distance(point1);

        if (isExist(side1, side2, side3)) {
            double p = semiPerimeter(side1, side2, side3);
            result = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }
        return result;
    }
}