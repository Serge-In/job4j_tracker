package ru.job4j.queue;

import java.util.Deque;
import java.lang.StringBuilder;
import java.lang.Character;
import java.util.Iterator;

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
//        // this is ok
//        StringBuilder str = new StringBuilder();
//        int size = evenElements.size() / 2;
//        for (int i = 0; i < size; i++) {
//            str.append(evenElements.poll());
//            evenElements.poll();
//        }
//        return str.toString();

        // this is ok
        StringBuilder str = new StringBuilder();
        Iterator<Character> iterator = evenElements.iterator();
        while (iterator.hasNext()) {
            str.append(evenElements.poll());
            evenElements.poll();
        }
        return str.toString();

//        // this is ok
//        String str = "";
//        Iterator<Character> iterator = evenElements.iterator();
//        while (iterator.hasNext()) {
//            str += Character.toString(evenElements.poll());
//            evenElements.poll();
//        }
//        return str;
    }

    private String getDescendingElements() {
//        // this is ok
//        StringBuilder str = new StringBuilder();
//          int size = descendingElements.size();
//        for (int i = 0; i < size; i++) {
//            str.append(descendingElements.pollLast());
//        }
//        return str.toString();

        // this is ok
        StringBuilder str = new StringBuilder();
        Iterator<Character> iterator = descendingElements.iterator();
        while (iterator.hasNext()) {
            str.append(descendingElements.pollLast());
        }
        return str.toString();

//        // this is ok
//        String str = "";
//        Iterator<Character> iterator = descendingElements.iterator();
//        while (iterator.hasNext()) {
//            str += Character.toString(descendingElements.pollLast());
//        }
//        return str;

//        StringBuilder str = new StringBuilder();
//        //java.util.ConcurrentModificationException
//        for (char ch : descendingElements) {
//            str.append(descendingElements.pollLast());
//        }
//        return str.toString();

//        String str = "";
//        for (char ch : descendingElements) {
//            str += (descendingElements.pollLast()); //java.util.ConcurrentModificationException
//            str += (descendingElements.pollLast()).toString(); //java.util.ConcurrentModificationException
//            str += Character.toString(descendingElements.pollLast()); //java.util.ConcurrentModificationException
//            str += Character.toString(ch);//ok
//        }
//        return str.toString();
//    }
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}