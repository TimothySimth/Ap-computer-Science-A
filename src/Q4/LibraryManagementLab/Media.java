package Q4.LibraryManagementLab;

public abstract class Media implements Comparable{
    private String myTitle;
    private String myIsbn;
    private boolean isCheckedOut;

    public Media(String title, String isbn){
        myTitle = title;
        myIsbn = isbn;
        isCheckedOut = false;
    }

    public String getTitle() { return myTitle; }
    public String getIsbn() { return myIsbn; }
    public boolean getCheckedOut() { return isCheckedOut; }
    public void CheckedOutBook() { isCheckedOut = true; }
    public void CheckInBook() { isCheckedOut = false; }
    public void setMyTitle(String title) { myTitle = title; }
    public void setMyISBN(String isbn) { myIsbn=isbn; }


    public int compareTo(Object other) {
        Book o = (Book) other;
        return this.getTitle().compareTo(o.getTitle()); }
}
