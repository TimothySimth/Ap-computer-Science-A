package Q3;

public class bus extends vehicles{
    int myHomeCity;
    double myWorth;

    public bus(String n, int w, String homeCity) {
        super(n, w);
        myHomeCity = homeCity;
        myWorth = 50000;
    }

}