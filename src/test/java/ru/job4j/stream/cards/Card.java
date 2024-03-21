package ru.job4j.stream.cards;

import java.util.stream.Stream;

/**
 * 2024-03-21
 * 9. Генерирование колоды карт. FlatMap [#504873]
 * Напишите метод main, в котором с помощью конструктора Card(Suit suit, Value value) генерируется колода карт.
 */
enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
    V_6, V_7, V_8
}

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        System.out.println(
                Stream.of(Suit.values())
                        .flatMap(suit -> Stream.of(Value.values())
                                .map(value -> suit + " " + value))
                        .toList()
        );
    }
}