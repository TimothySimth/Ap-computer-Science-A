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
        for (int lcv = 0; lcv < books.size()-1; lcv++){
            if (books.get(lcv).compareTo(book) <= 0) {
                books.add(lcv, book);
                System.out.println("Book added successfully.");
            }
            else if (lcv == books.size()-2) books.add(lcv, book);
        }
    }
    @Override
    public void removeBook(String isbn) {
        int index = findIndexOfISBN(isbn);
        if (index != -1)
            books.remove(index);
    }

    @Override
    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron added successfully.");
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
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Book checked out unsuccessful.");
        }
    }

    @Override
    public void updateTransaction(String isbn, String patronId, String returnDate) {
        if (checkinBook(isbn, patronId)) {
            transactions.get(findIndexOfISBNTrans(isbn)).setReturnDate(returnDate);
            System.out.println("Book checked in successful.");
        }
        System.out.println("Book checked in unsuccessful.");
    }
    // Other methods...

    @Override
    public void viewMostRecentTransaction(String isbn) {
        for (int lcv = transactions.size()-1; lcv >= 0; lcv--){
            if (transactions.get(lcv).getIsbn().equals(isbn)){
                System.out.println("Book Found: " + transactions.get(lcv));
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    @Override
    public boolean checkoutBook(String isbn, String patronId) {
        int indexOfBook = findIndexOfISBN(isbn);
        int indexOfPatron = findIndexOfID(patronId);
        if (books.get(indexOfBook).getCheckedOut() == false){
            books.get(indexOfBook).setCheckedOut(true);
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
                books.get(findIndexOfISBN(isbn)).setCheckedOut(false);
                return true;
            }
        }
        return false;
    }



    @Override
    public Book findClosestBook(String title) {
        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
        return null;
    }

    @Override
    public Book searchBookByTitle(String title) {
        BinarySearchUtil book = new BinarySearchUtil(books, title);
        return book.goHookTitle(0, books.size()-1);
    }

    @Override
    public Book searchBookByAuthor(String author) {
        BinarySearchUtil book = new BinarySearchUtil(books, author);
        return book.goHookAuthor(0, books.size());
    }


    public int findIndexOfISBN(String isbn) {
        int index = -1;
        for (int i =0; i < books.size()-1; i++){
            if (books.get(i).getIsbn().equals(isbn)) index = i;
        }
        return index;
    }
    public int findIndexOfID(String id) {
        int index = -1;
        for (int i =0; i < books.size()-1; i++){
            if (patrons.get(i).getPatronId().equals(id)) index = i;
        }
        return index;
    }
    public int findIndexOfISBNTrans(String isbn){
        int index = -1;
        for (int i =0; i < transactions.size()-1; i++){
            if (transactions.get(i).getIsbn().equals(isbn)) index = i;
        }
        return index;
    }


    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
