package ru.job4j.hashmap;

/**
 * 2023-12-29
 * 4. Аттестация [#504878]
 * Класс Label содержит результаты: имя и баллы. Этот класс используется как для учеников, так и для предметов
 */
public record Label(String name, double score) implements Comparable<Label> {
    @Override
    public int compareTo(Label o) {
        return Double.compare(this.score, o.score);
    }
}
