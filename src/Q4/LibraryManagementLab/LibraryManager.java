package Q4.LibraryManagementLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class LibraryManager {
    /* ========== DO NOT MODIFY (Except data file path) ========== */
    public static ArrayList<Book> loadCatalog() {
        try {
            // Dataset source: https://www.kaggle.com/datasets/saurabhbagchi/books-dataset
            System.out.print("Loading catalog...");
            String path = "C:\\Users\\smith.t7\\Documents\\GitHub\\Ap-computer-Science-A\\src\\Q4\\LibraryManagementLab\\book_catalog.csv";  // Change directory as needed
            Scanner file = new Scanner(new File(path));
            ArrayList<Book> books = new ArrayList<>();
            while (file.hasNextLine()) {
                String[] bookData = file.nextLine().split(";");
                String isbn = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                Book book = new Book(title, isbn, author);
                books.add(book);
            }
            file.close();
            System.out.println("success.");
            return books;
        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found. Returning empty catalog.");
        }
        return new ArrayList<>();
    }


    // add each book from the catalog to the library, then display the menu
    public static void main(String[] args) {
        ArrayList<Book> books = loadCatalog();
        ArrayList<Patron> patrons = new ArrayList<>();
        ArrayList<Transaction> transactions = new ArrayList<>();
        Library library = new Library(books, patrons, transactions);
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Menu:\n1. Add patron\n" +
                               "2. Add Book\n" +
                               "3. Remove Book\n" +
                               "4. Checkout Book\n" +
                               "5. Return Book\n" +
                               "6. Search Book\n" +
                               "7. Search Book Transaction\n" +
                               "8. Exit\n" +
                               "Enter Choice: ");

            int chose = input.nextInt();
            input.nextLine();

            if (chose == 1){
                System.out.print("Enter Name: ");
                String name = input.nextLine();
                System.out.print("Enter Patron ID: ");
                String patronID = input.nextLine();
                Patron patron = new Patron(name, patronID);
                library.addPatron(patron);
            }
            else if (chose == 2){
                System.out.print("Enter ISBN: ");
                String isbn = input.nextLine();
                System.out.print("Enter Title: ");
                String title = input.nextLine().toLowerCase();
                System.out.print("Enter author: ");
                String author = input.nextLine().toLowerCase();
                Book book = new Book(title, isbn, author);
                library.addBook(book);
            }
            else if (chose == 3){
                System.out.print("Enter ISBN: ");
                String isbn = input.nextLine();
                library.removeBook(isbn);
            }
            else if (chose == 4){
                System.out.print("Enter ISBN: ");
                String isbn = input.nextLine();
                System.out.print("Enter Patron ID: ");
                String patronID = input.nextLine();
                library.createTransaction(isbn, patronID, Library.getDateToday());
            }
            else if (chose == 5){
                System.out.print("Enter ISBN: ");
                String isbn = input.nextLine();
                System.out.print("Enter Patron ID: ");
                String patronID = input.nextLine();
                library.updateTransaction(isbn, patronID, Library.getDateToday());
            }
            else if (chose == 6){
                System.out.print("Enter Title: ");
                String title = input.nextLine().toLowerCase();
                Book book = library.searchBookByTitle(title);
                if (book != null)
                    System.out.println("Book Found: " + book + "\n");
                else System.out.println("Book Not Found.");
            }
            else if (chose == 7){
                System.out.print("Enter ISBN: ");
                String isbn = input.nextLine();
                library.viewMostRecentTransaction(isbn);
            }
            else if (chose == 8){
                System.out.println("Exiting...");
                return;
            }
            else
                System.out.println("Invalid input");
        }

    }
}
/*
Loading catalog...success.
Menu:
1. Add patron
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter Choice: 1
Enter Name: Joe
Enter Patron ID: 123
Patron added successfully.

Menu:
1. Add patron
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter Choice: 6
Enter Title: Basic Nursing
Book Found: Book{title='Basic Nursing: Theory and Practice', isbn='0801678765', author='Patricia A. Potter'}

Menu:
1. Add patron
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter Choice: 4
Enter ISBN: 0801678765
Enter Patron ID: 123
Book checked out successfully.

Menu:
1. Add patron
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter Choice: 7
Enter ISBN: 0801678765
Book Found: Transaction{isbn='0801678765', patronId='123', checkoutDate='2025-05-16', returnDate='null'}

Menu:
1. Add patron
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter Choice: 5
Enter ISBN: 0801678765
Enter Patron ID: 123
Book checked in successful.

Menu:
1. Add patron
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter Choice: 7
Enter ISBN: 0801678765
Book Found: Transaction{isbn='0801678765', patronId='123', checkoutDate='2025-05-16', returnDate='2025-05-16'}

Menu:
1. Add patron
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter Choice: 2
Enter ISBN: 1122334455
Enter Title: Testing User Interfaces 101
Enter author: George Oregon
Book added successfully.

Menu:
1. Add patron
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter Choice: 3
Enter ISBN: 1122334455
Book removed successfully.

Menu:
1. Add patron
2. Add Book
3. Remove Book
4. Checkout Book
5. Return Book
6. Search Book
7. Search Book Transaction
8. Exit
Enter Choice: 8
Exiting...
*/