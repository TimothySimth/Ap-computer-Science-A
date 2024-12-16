package Q2.prog602b;

public class InternetCustermer {
    private int myAcc;
    private double myHours;
    private int myCode;
    private double myCharge;

    public InternetCustermer(int acc, double hours, int code) {
        myAcc = acc;
        myHours = hours;
        myCode = code;
        myCharge = 0;
    }
    public void setcharge() {
        double surCharge = 0;
        if (myCode == 1) surCharge = 50;
        else if (myCode == 2) surCharge = 150;

        // TODO: Calc charge

        myCharge += myCode;
    }

    public int getAcc() {return myAcc; }
    public double getHours() {return myHours; }
    public int getCode() {return myCode; }
    public double getCharge() {return myCharge; }
}
