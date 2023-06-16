package ru.job4j.stratagy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        String nl = System.lineSeparator();
        return "      _" + nl
             + "    _   _" + nl
             + "  _       _" + nl
             + "_____________" + nl;
    }
}