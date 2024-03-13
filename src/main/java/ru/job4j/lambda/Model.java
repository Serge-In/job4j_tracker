package ru.job4j.lambda;

/**
 * 2024-03-12
 * 4. Ссылки на конструкторы [#504922]
 */
public class Model {
    private String name;

    Model() {
    }

    Model(String str) {
        name = str;
    }

    String getName() {
        return name;
    }
}

