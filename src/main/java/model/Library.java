package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    private static Map<String, Book> books = new HashMap<>();

    private Library() {
    }

    public static void addLibraryBooks(Scanner scanner) {
        while (true) {
            String title = "", genre = "";
            Integer numberOfPages = 0;
            System.out.println("\n---- Adding Book(s) ----\n");
            try {
                System.out.print("Please enter the title: ");
                title = scanner.nextLine();
                System.out.print("Please enter the genre: ");
                genre = scanner.nextLine();

                if (title.isBlank() || genre.isBlank())
                    throw new Exception("Blank values are invalid. Please try again.");

                System.out.print("Please enter the number of pages: ");
                numberOfPages = scanner.nextInt();
                scanner.nextLine();

                Book book = new Book(title, genre, numberOfPages);
                Library.addBook(title, book);

                System.out.print("Are you done adding books(Y/n): ");
                Boolean isDone = !scanner.nextLine().equals("n");
                if (isDone)
                    return;
            } catch (Exception e) {
                String errorMessage = e.getMessage() == null ? "\nERROR: Invalid number of pages. Please try again."
                        : "\nERROR:" + e.getMessage();
                System.out.println(errorMessage);
                // scanner.nextLine();
                if (scanner.hasNextLine())
                    scanner.nextLine();
            }
        }
    }

    public static void lookupLibraryBook(Book book) {

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
