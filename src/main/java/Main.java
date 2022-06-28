import java.util.Scanner;

import model.Book;
import model.Library;

// Ask the user if they want to add a book or look up an existing book
// If they want to look up an existing book, ask them for the title of the book
// Using the title they enter, look up the book in your map-based list
// If you find the book, display the book's information and continue your loop
// If you don't find the book, tell the user your library doesn't have that book and continue your loop

public class Main {
    public static void main(String[] args) {
        System.out.println(Library.getLibrary());
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n---- Library System ----");
                System.out.print(
                        "Do you want to add a book or look up an existing book? (Choose add/LOOK): ");
                String userChoice = scanner.nextLine();
                if (userChoice.equalsIgnoreCase("add"))
                    Library.addLibraryBooks(scanner);
                else
                    Library.look

                    System.out.print("Are you done with the library system? (Y/n): ");
                boolean isDone = !scanner.nextLine().equals("n");
                if (isDone)
                    return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
