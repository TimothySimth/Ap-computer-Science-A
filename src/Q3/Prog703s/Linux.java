package Q3.Prog703s;

public class Linux extends Computers{
    int hiddenCode;

    public Linux(String name, int number, double value, int code) {
        super(name, number, value);
        hiddenCode = code;
    }

    public int getCode() { return hiddenCode; }
}
