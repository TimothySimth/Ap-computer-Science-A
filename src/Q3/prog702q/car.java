package Q3.prog702q;


public class car extends vehicles {
    int myCost;
    public car(String n, int w,int cost){
        super(n, w);
        myCost = cost;
    }


    public int getCost() { return myCost; }
}