package ru.job4j.oop;

public class Error {
    boolean active; // = true;
    int status; // = 1;
    String message; // = "yes";

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active = " + active);
        System.out.println("status = " + status);
        System.out.println("message = " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printInfo();
        Error error2 = new Error(true, 1, "yes");
        error2.printInfo();
        Error error3 = new Error(true, 3, "go home!");
        error3.printInfo();
    }
}
