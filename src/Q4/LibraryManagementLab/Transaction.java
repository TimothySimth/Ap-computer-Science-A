package Q4.LibraryManagementLab;

public class Transaction {
    private String myIsbn;
    private String myPatronId;
    private String myCheckoutDate; // Simple date format
    private String myReturnDate; // Optional, can be null if not returned yet

    public Transaction(String isbn, String patronId, String checkoutDate){
        myIsbn = isbn;
        myPatronId = patronId;
        myCheckoutDate = checkoutDate;
        myReturnDate = null;
    }

    public String getIsbn(){return myIsbn;}
    public String getPatronId(){return myPatronId;}
    public String getMyCheckoutDate(){return myCheckoutDate;}
    public String getMyReturnDate(){return myReturnDate;}

    public void setIsbn(String isbn)                 { myIsbn = isbn; }
    public void setPatronId(String patronId)         { myPatronId = patronId; }
    public void setCheckoutDate(String checkoutDate) { myCheckoutDate = checkoutDate; }
    public void setReturnDate(String returnDate)     { myReturnDate = returnDate; }



    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + myIsbn + '\'' +
                ", patronId='" + myPatronId + '\'' +
                ", checkoutDate='" + myCheckoutDate + '\'' +
                ", returnDate='" + myReturnDate + '\'' +
                '}';
    }
}