package ru.job4j.oop;

public class Wolf {
    public void tryEat(Ball ball) {
        System.out.println("Wolf says: Hey, Ball! I'll eat You! " + ball.tryRun(false));
    }
}