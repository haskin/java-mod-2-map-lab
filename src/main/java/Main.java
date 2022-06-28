import java.util.Scanner;

import model.Book;
import model.Library;

public class Main {
    public static void main(String[] args) {
        // your code here
        getUserBooks();
        System.out.println("\n---- Printing Library ----");
        System.out.println(Library.getLibrary());
    }

    public static void getUserBooks() {
        try (Scanner scanner = new Scanner(System.in)) {
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
                    String errorMessage = e.getMessage() == null ? "Invalid number of pages. Please try again."
                            : e.getMessage();
                    System.out.println(errorMessage);
                    // scanner.nextLine();
                    if (scanner.hasNextLine())
                        scanner.nextLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
