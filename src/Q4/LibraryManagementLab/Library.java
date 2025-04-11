package Q4.LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Library implements LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    // TODO: Implement the constructor

    // Implement interface methods
    @Override
    public void addBook(Book book) { /* Implementation; remember to add in sorted order */ }
    @Override
    public void removeBook(String isbn) { /* Implementation */ }

    @Override
    public void addPatron(Patron patron) {

    }

    @Override
    public void removePatron(String patronId) {

    }

    @Override
    public void createTransaction(String isbn, String patronId, String checkoutDate) {

    }

    @Override
    public void updateTransaction(String isbn, String patronId, String returnDate) {

    }
    // Other methods...

    @Override
    public void viewMostRecentTransaction(String isbn) {
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"
    }

    @Override
    public boolean checkoutBook(String isbn, String patronId) {
        return false;
    }

    @Override
    public boolean checkinBook(String isbn, String patronId) {
        return false;
    }

    // TODO: Complete the implementation of LibrarySystem methods
    // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

    @Override
    public Book findClosestBook(String title) {
        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
        return null;
    }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
        return null;
    }

    @Override
    public Book searchBookByAuthor(String author) {
        return null;
    }

    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
