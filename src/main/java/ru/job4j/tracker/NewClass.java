package ru.job4j.tracker;

public class NewClass {
    public static void main(String[] args) {
        Output out = new StubOutput();
        StartUI startUI = new StartUI(out);
        String[] args1 = {};
        startUI.main(args1);

    }
}
