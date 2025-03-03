package Q3.Prog703s;

public class Computers {
    String myName;
    double myValue;
    int myNumber;

    public Computers(String name, int number,double value) {
        myName = name;
        myValue = value;
        myNumber = number;
    }

    public String getName() { return myName; }
    public double getValue()   { return myValue; }
    public int getNum()     { return myNumber; }
}