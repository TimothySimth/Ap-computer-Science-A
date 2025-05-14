package Q4.LibraryManagementLab;

public abstract class Media {
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
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }


    public abstract int compareTo(Book other);
}
