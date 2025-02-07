package Q3.prog702p;

public class hicca extends animal{
    double myFurCost;

    public hicca(String n, String w, double fCost) {
        super(n, w);
        myFurCost = fCost;

    }
    public double getFurCost() { return myFurCost; }
}
