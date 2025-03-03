package Q3.Prog703s;

public class Mac extends Computers{
    String myColor;

    public Mac(String name, int number, double value, String color) {
        super(name, number, value);
        myColor = color;
    }

    public String getColor() { return myColor; }
}
