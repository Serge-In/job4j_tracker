package ru.job4j.tracker.output;

/**
 * 2023-06-16
 * 12.1 Зависимость от System.out [#33568 # [#33568]]
 * Заглушка
 * В классе заглушке мы используем поле с типом StringBuilder.
 * Класс StringBuilder позволяет складывать строки.
 */
public class Stub implements Output {
    private final StringBuilder buffer = new StringBuilder();

    @Override
    public void println(Object obj) {
        if (obj != null) {
            buffer.append(obj.toString());
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}