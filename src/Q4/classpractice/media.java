package  Q4.classpractice;

public abstract class media {
    private int myNum;
    private String myName;
    private String myAuthor;

    public media(int num, Stirng name, String author) {
        myName = name;
        myNum = num;
        myAuthor = author;
    }

    public int getNum() { return myNum; }
    public String getName() { return myName; }
    public String getAuthor() { return myAuthor; }
    public void setNum(int num) { myNum = num; }
    public void setName(String name) { myName = name; }
    public void setAuthor(string author) { myAuthor = author; }
    
}