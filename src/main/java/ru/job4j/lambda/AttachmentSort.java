package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 2024-01-11
 * 1.1. Анонимные классы [#214142]
 * Создайте анонимный класс на основе интерфейса Comparator для модели Attachment. Класс должен сравнивать имена объектов Attachment
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> comparator = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator<Attachment> comparatorName = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Comparator<String> comparatorText = (left, right) -> left.compareTo(right);

        Comparator<String> comparatorDescSize = (left, right) -> Integer.compare(right.length(), left.length());
    }
}