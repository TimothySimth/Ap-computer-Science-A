package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class Patron {
    private String myName;
    private String myPatronId;
    private ArrayList<Book> checkedOutBooks;

    public Patron(String name, String patronId){
        myName = name;
        myPatronId = patronId;
        checkedOutBooks = new ArrayList<>();
    }

    // Basic getters
    public String getName() { return myName; }
    public String getPatronId() { return myPatronId; }



    public void checkInBook(Book book){
        checkedOutBooks.remove(book);
        book.CheckInBook();
    }
    public void checkOutBook(Book book){
        checkedOutBooks.add(book);
        book.CheckedOutBook();
    }
}
