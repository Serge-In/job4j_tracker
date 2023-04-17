package ru.job4j.pojo;

/**
 * 3. Массивы и модели. [#174892]
 * 2023-04-17
 */
public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Clean code", 100);
        Book book2 = new Book("Fairy Tales", 50);
        Book book3 = new Book("How to jump over the Moon", 999);
        Book book4 = new Book("Java manual", 333);
        Book[] books = {book1, book2, book3, book4};

        for (Book book : books) {
            System.out.println("book = " + book.getName());
        }
        Book bookTemp = books[0];
        books[0] = books[3];
        books[3] = bookTemp;

        for (int i = 0; i < books.length; i++) {
            System.out.println("book = " + books[i].getName());
        }

        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println("find the book = " + book.getName());
            }
        }
    }
}
