package Q4.LibraryManagementLab;


public class Book extends Media {
    private String myAuthor;

    public Book(String title, String isbn, String author) {
        super(title, isbn);
        myAuthor = author;
    }


    public String getAuthor() {
        return myAuthor;
    }
    public void setAuthor(String author) { myAuthor = author; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + myAuthor + '\'' +
                '}';
    }

}
