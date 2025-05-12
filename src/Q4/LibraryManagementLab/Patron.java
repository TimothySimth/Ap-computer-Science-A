package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class Patron {
    private String myName;
    private String myPatronId;
    private ArrayList<Book> checkedOutBooks;

    // TODO: Implement constructor (name, patronId)
    public Patron(String name, String patronId){
        myName = name;
        myPatronId = patronId;
    }

    // Basic getters
    public String getName() { return myName; }
    public String getPatronId() { return myPatronId; }

    // TODO: Implement checkInBook(Book book) and checkOutBook(Book book) methods (remove/add book from checkedOutBooks)
    // Don't forget to set the book's checkedOut field to true/false
}
