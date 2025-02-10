package Q3;

public class truck extends vehicles{
    int myMiles;
    double myWorth;

    public truck(String n, int w, int miles) {
        super(n, w);
        myMiles = miles;
        myWorth = 50000;
    }

}