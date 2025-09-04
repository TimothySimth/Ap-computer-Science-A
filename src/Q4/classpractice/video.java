package Q4.classpractice;

public class video extends media {
    private string mypath;

    public video(int num, Stirng name, String author, String path) {
        super(num, name, author);
        mypath = path;
    }

    public double getduration() { return myDuration; }
    public void setduration(double duration) { myDuration = duration; }

}