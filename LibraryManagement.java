

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Book recommendations as strings
        String DSABooks = "1. Introduction to Algorithms by Cormen, Leiserson, Rivest, and Stein (CLRS)\n" +
                          "2. Algorithms by Robert Sedgewick and Kevin Wayne\n" +
                          "3. Data Structures and Algorithm Analysis in C++ by Mark Allen Weiss";

        String DAABooks = "1. Introduction to Algorithms by Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein\n" +
                          "2. Algorithms by Robert Sedgewick and Kevin Wayne\n" +
                          "3. The Algorithm Design Manual by Steven S. Skiena.";

        String OSBooks = "1. Operating Systems: Three Easy Pieces by Remzi H. Arpaci-Dusseau and Andrea C. Arpaci-Dusseau\n" +
                         "2. Modern Operating Systems by Andrew S. Tanenbaum and Herbert Bos\n" +
                         "3. Operating System Concepts by Abraham Silberschatz, Peter Baer Galvin, and Greg Gagne";

        String SQLBooks = "1. SQL in 10 Minutes, Sams Teach Yourself by Ben Forta\n" +
                          "2. SQL Queries for Mere Mortals by John L. Viescas and Michael J. Hernandez\n" +
                          "3. Learning SQL by Alan Beaulieu";

        // Get subject from user
        System.out.println("Enter a subject (DSA, DAA, OS, SQL): ");
        String subject = scanner.nextLine().trim();

        // Display books based on the subject
        String books = "";
        switch (subject) {
            case "DSA":
                books = DSABooks;
                break;
            case "DAA":
                books = DAABooks;
                break;
            case "OS":
                books = OSBooks;
                break;
            case "SQL":
                books = SQLBooks;
                break;
            default:
                System.out.println("No recommendations available for the entered subject.");
                scanner.close();
                return;
        }

        System.out.println("Books available for " + subject + ":\n" + books);

        // Allow user to select a book
        System.out.println("Enter the number of the book you want to select: ");
        int choice = scanner.nextInt();

        // Validate and display the selection
        String[] selectedBooks = books.split("\n");
        if (choice > 0 && choice <= selectedBooks.length) {
            System.out.println("You selected: " + selectedBooks[choice - 1].substring(3));
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
