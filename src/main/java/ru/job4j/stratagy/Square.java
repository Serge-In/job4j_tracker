package ru.job4j.stratagy;

public class Square implements Shape {
    @Override
    public String draw() {
        String nl = System.lineSeparator();
        return "_____" + nl
               + "_   _" + nl
               + "_   _" + nl
               + "_   _" + nl
               + "_   _" + nl
               + "_____" + nl;
    }
}
