package ru.job4j.stratagy;
/**
 * 2023-06-16
 * 11.0. Шаблон проектирования - Стратегия [#786  [#786]]
 * 1 Создать классы Paint, Triangle, Square, интерфейс Shape в пакете ru.job4j.strategy.
 * 2 В интерфейсе Shape объявить метод String draw(). Метод draw() должен возвращать фигуру в виде строки.
 * 3 Реализовать интерфейс Shape для квадрата (Square), треугольника (Triangle);
 * 4 В классе Paint реализовать метод public void draw(Shape shape).
 * Метод draw() должен печатать псевдокартинку на консоль через метод System.out.println(shape.draw())
 */
public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        context.draw(new Square());
        context.draw(new Triangle());
    }
}
