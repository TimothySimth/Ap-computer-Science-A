package Q4.LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;


public class Library implements LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    public Library(ArrayList<Book> yBooks, ArrayList<Patron> yPatrons, ArrayList<Transaction> yTransactions){
        patrons = yPatrons;
        transactions = yTransactions;
        Collections.sort(yBooks);
        books = yBooks;
    }

    // Implement interface methods
    @Override
    public void addBook(Book book) {
        for (int lcv = 0; lcv < books.size(); lcv++){
            if (books.get(lcv).compareTo(book) <= 0) {
                books.add(lcv, book);
                System.out.println("Book added successfully.\n");
                return;
            }
        }
        System.out.println("Book added unsuccessfully.\n");
    }
    @Override
    public void removeBook(String isbn) {
        int index = findIndexOfISBN(isbn);
        if (index != -1) {
            books.remove(index);
            System.out.println("Book removed successfully.\n");
            return;
        }
        System.out.println("Book removed unsuccessfully.\n");
    }

    @Override
    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron added successfully.\n");
    }

    @Override
    public void removePatron(String patronId) {
        int index = findIndexOfID(patronId);
        if (index != -1)
            patrons.remove(index);
    }

    @Override
    public void createTransaction(String isbn, String patronId, String checkoutDate) {
        if (checkoutBook(isbn, patronId)){
            Transaction tran = new Transaction(isbn, patronId, checkoutDate);
            transactions.add(tran);
            System.out.println("Book checked out successfully.\n");
        } else {
            System.out.println("Book checked out unsuccessful.\n");
        }
    }

    @Override
    public void updateTransaction(String isbn, String patronId, String returnDate) {
        if (checkinBook(isbn, patronId)) {
            transactions.get(findIndexOfISBNTrans(isbn)).setReturnDate(returnDate);
            System.out.println("Book checked in successful.\n");
        }
        else
            System.out.println("Book checked in unsuccessful.\n");
    }
    // Other methods...

    @Override
    public void viewMostRecentTransaction(String isbn) {
        for (int lcv = transactions.size()-1; lcv >= 0; lcv--){
            if (transactions.get(lcv).getIsbn().equals(isbn)){
                System.out.println("Book Found: " + transactions.get(lcv) + "\n");
                return;
            }
        }
        System.out.println("Book Not Found\n");
    }

    @Override
    public boolean checkoutBook(String isbn, String patronId) {
        int indexOfBook = findIndexOfISBN(isbn);
        int indexOfPatron = findIndexOfID(patronId);
        if (!books.get(indexOfBook).getCheckedOut()){
            patrons.get(indexOfPatron).checkOutBook(books.get(indexOfBook));
            return true;
        }
        return false;
    }


    @Override
    public boolean checkinBook(String isbn, String patronId) {
        for (Transaction tran : transactions) {
            if (tran.getIsbn().equals(isbn) && tran.getPatronId().equals(patronId)) {
                patrons.get(findIndexOfID(patronId)).checkInBook(books.get(findIndexOfISBN(isbn)));
                return true;
            }
        }
        return false;
    }



    @Override
    public Book findClosestBook(String title) {
        for (Book i : books) {
            if (i.getTitle().toLowerCase().contains(title)) {
                return new Book(i.getTitle(), i.getIsbn(), i.getAuthor());
            }
        }
        return null;
    }

    @Override
    public Book searchBookByTitle(String title) {
        BinarySearchUtil book = new BinarySearchUtil(books, title);
        var o = book.goHookTitle(0, books.size()-1);
        if (o != null) return o;
        return findClosestBook(title);
    }

    @Override
    public Book searchBookByAuthor(String author) {
        BinarySearchUtil book = new BinarySearchUtil(books, author);
        return book.goHookAuthor(0, books.size());
    }


    public int findIndexOfISBN(String isbn) {
        int index = -1;
        for (int i =0; i < books.size(); i++){
            if (books.get(i).getIsbn().equals(isbn)) index += 1;
        }
        return index;
    }
    public int findIndexOfID(String id) {
        int index = -1;
        for (int i = 0; i < patrons.size(); i++){
            if (patrons.get(i).getPatronId().equals(id)) index += 1;
        }
        return index;
    }
    public int findIndexOfISBNTrans(String isbn){
        int index = -1;
        for (int i = 0; i < transactions.size(); i++){
            if (transactions.get(i).getIsbn().equals(isbn)) index += 1;
        }
        return index;
    }
    public void printPatrons() {
        for (Patron p : patrons){
            System.out.println("Name: " + p.getName() + " Id: " + p.getPatronId());
        }
    }
    public void printBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
    public void printTrans() {
        for (Transaction t : transactions){
            System.out.println(t);
        }
    }


    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
