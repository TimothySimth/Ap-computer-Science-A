package Q3.prog702p;

public class Wallie extends animal{
    double myStepsTaken;

    public Wallie(String n, String w, double fCost) {
        super(n, w);
        myStepsTaken = fCost;

    }
    public double getStepsTaken() { return myStepsTaken; }
}
