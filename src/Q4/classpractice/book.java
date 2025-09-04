package Q4.classpractice;

public class book extends media{
    private int myPages;

    public book(int num, Stirng name, String auther, int pages) {
        super(num, name, author);
        myPages = pages;
    }

    public double getpages() { return myPages; }
    public void setpages(int pages) { mypages = pages; }

}

