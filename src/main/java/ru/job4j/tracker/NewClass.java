package ru.job4j.tracker;

import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.Stub;

public class NewClass {
    public static void main(String[] args) {
        Output out = new Stub();
        StartUI startUI = new StartUI(out);
        String[] args1 = {};
        startUI.main(args1);

    }
}
