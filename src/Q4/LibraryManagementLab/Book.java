package Q4.LibraryManagementLab;

public class Book extends Media {
    private String author;

    public Book(String title, String isbn, String author) {
        super();
    }

    // TODO: Implement constructor (title, isbn, author); call super constructor

    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    private String getIsbn() {
        return null;
    }

    private String getTitle() {
        return null;
    }
}
