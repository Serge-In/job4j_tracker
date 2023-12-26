package ru.job4j.queue;

import java.util.Deque;
import java.lang.StringBuilder;
import java.lang.Character;

/**
 * 2023-12-26
 * 2. Интерфейс Deque [#504943]
 * - метод getEvenElements должен взять из очереди evenElements только четные символы и все их соберет в результирующую строку.
 * Для реализации вам понадобится цикл fori, строку формируйте с помощью StringBuilder. Эта очередь всегда имеет четное число элементов;
 * - метод getDescendingElements должен брать символы начиная с последнего символа и так пока не заберет их все.
 * Каждый символ мы добавляем в результирующую строку, формируем с помощью StringBuilder.
 */
public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder str = new StringBuilder();
        int size = evenElements.size() / 2;
        for (int i = 0; i < size; i++) {
            str.append(evenElements.poll());
            evenElements.poll();
        }
        return str.toString();
    }

    private String getDescendingElements() {
        StringBuilder str = new StringBuilder();
          int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            str.append(descendingElements.pollLast());
        }
        return str.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}