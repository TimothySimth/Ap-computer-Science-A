package Q3.Prog703s;

public class Windows extends Computers{
    double myVersion;

    public  Windows(String name, int number, double value, double version) {
        super(name, number, value);
        myVersion = version;
    }

    public double getVersion() { return myVersion; }
}
