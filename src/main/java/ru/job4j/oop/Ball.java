package ru.job4j.oop;

public class Ball {
    public String tryRun1(boolean condition) {
        return condition ? "Ball have run away" : "Ball have been eaten";
    }

    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Ball have been eaten");
        } else {
            System.out.println("Ball have run away");
        }
    }
}
