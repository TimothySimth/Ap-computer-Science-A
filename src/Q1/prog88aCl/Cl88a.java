package Q1.prog88aCl;

public class Cl88a {
    private int    myspeed;
    private int vehicalspeed;
    private double myAmtDue;

    public Cl88a(int speed, int vspeed) {
        myspeed         = speed;
        vehicalspeed    = vspeed;
        myAmtDue        = 0;
    }
    public void calc(){
        myAmtDue = 20.00 + ((myspeed - vehicalspeed) * 5.00);
    }

    public String toString() {
        return String.format("Enter Speed limit: %d\tEnter Car Speed: %d\tAmount Due: $%.2f", myspeed, vehicalspeed, myAmtDue);
    }
}
