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
        int chose = 0;
        while (true){
            System.out.println("1. Add patron\n" +
                               "2. Add Book\n" +
                               "3. Remove Book\n" +
                               "4. Checkout Book\n" +
                               "5. Return Book\n" +
                               "6.Search Book\n" +
                               "7. Search Book Transaction\n" +
                               "8. Exit\n\n");
            if (input.hasNextInt())
                chose = input.nextInt();
            if (chose == 1){
                System.out.print("Enter Name: ");
                String name = input.next();
                System.out.print("Enter Patron ID: ");
                String patronID = input.next();
                Patron patron = new Patron(name, patronID);
                library.addPatron(patron);
            }
            else if (chose == 2){
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                System.out.print("Enter Title: ");
                String title = input.next();
                input.nextLine();
                System.out.print("Enter author: ");
                String author = input.next();
                Book book = new Book(title, isbn, author);
                library.addBook(book);
            }
            else if (chose == 3){
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                library.removeBook(isbn);
            }
            else if (chose == 4){
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                System.out.print("Enter Patron ID: ");
                String patronID = input.next();
                library.createTransaction(isbn, patronID, Library.getDateToday());
            }
            else if (chose == 5){
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                System.out.print("Enter Patron ID: ");
                String patronID = input.next();
                library.updateTransaction(isbn, patronID, Library.getDateToday());
            }
            else if (chose == 6){
                System.out.print("Enter Title: ");
                String title = input.next().toLowerCase();
                Book book = library.searchBookByTitle(title);
                if (book != null)
                    System.out.println("Book Found: " + book + "\n");
                else System.out.println("Book Not Found.");
            }
            else if (chose == 7){
                System.out.print("Enter ISBN: ");
                String isbn = input.next();
                library.viewMostRecentTransaction(isbn);
            }
            else if (chose == 8){
                return;
            } else if (chose == 154){
                library.printPatrons();
            }
            else
                System.out.println("Invalid input");
        }

    }
}
