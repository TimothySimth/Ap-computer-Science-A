package Q3.prog702q;

public class vehicles implements names{
    private String myName;
    private int myTires;

    public  vehicles(String n, int t) {
        myName = n;
        myTires = t;
    }

    public String getName()  {return myName;}
    public int getTires() {return myTires;}
}
