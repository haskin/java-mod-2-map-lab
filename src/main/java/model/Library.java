package model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> books = new ArrayList<>();

    private Library() {
    }

    public static void addBook(Book book) {
        Library.books.add(book);
    }

    public static void removeBook(Book book) {
        Library.books.remove(book);
    }

    public static void getBook(Book book) {
        Library.books.remove(book);
    }

    public static List<Book> getLibrary() {
        return Library.books;
    }

    @Override
    public String toString() {

        return Library.books.toString();
    }
}
