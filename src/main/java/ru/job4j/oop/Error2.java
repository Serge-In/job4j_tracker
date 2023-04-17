package ru.job4j.oop;
public class Error2 {
    boolean active = true;
    int status = 1;
    String message = "yes";

    public Error2() {
        this.active = true;
        this.status = 2;
        this.message = "2yes";
    }

    public Error2(boolean active, int status, String message) {
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
        //Error2 error2 = new Error2(true, 4, "4yes");
        Error2 error2 = new Error2();
        error2.printInfo();
    }
}