package model;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private static Map<String, Book> books = new HashMap<>();

    private Library() {
    }

    public static void addBook(String title, Book book) {
        Library.books.put(title, book);
    }

    public static void getBook(String title) {
        Library.books.remove(title);
    }

    public static Map<String, Book> getLibrary() {
        return Library.books;
    }

    @Override
    public String toString() {

        return Library.books.toString();
    }
}
