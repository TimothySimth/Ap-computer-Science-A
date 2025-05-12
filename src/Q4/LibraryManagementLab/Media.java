package Q4.LibraryManagementLab;

public abstract class Media {
    private String myTitle;
    private String myIsbn;
    private boolean isCheckedOut;

    public Media(String title, String isbn){
        myTitle = title;
        myIsbn = isbn;
    }

    public String getTitle() { return myTitle; }
    public String getIsbn() { return myIsbn; }
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
