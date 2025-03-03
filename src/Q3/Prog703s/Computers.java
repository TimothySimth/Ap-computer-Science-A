package Q3.Prog703s;

public class Computers {
    String myName;
    int myValue;
    int myNumber;

    public Computers(String name, int number,int value) {
        myName = name;
        myValue = value;
        myNumber = number;
    }

    public String getName() { return myName; }
    public int getValue()   { return myValue; }
    public int getNum()     { return myNumber; }
}