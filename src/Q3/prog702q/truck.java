package Q3.prog702q;

public class truck extends vehicles{
    int myMiles;
    double myCost;

    public truck(String n, int w, int miles) {
        super(n, w);
        myMiles = miles;
        myCost = 50000;
    }

    public void calcCost(){ myCost -= myMiles * 0.25; }

    public double getCost() { return myCost; }
    public int getMiles() { return myMiles; }
}