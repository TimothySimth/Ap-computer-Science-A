package Q3.Q3Farm;

public abstract class Animal {
    private String myName;
    private int myWeight;
    private int myNumCorn;
    private int myNumHayBales;

    public Animal(String name, int weight, int corn, int hay){
        myName = name;
        myWeight = weight;
        myNumCorn = corn;
        myNumHayBales = hay;
    }

    public abstract double value(double cornCost, double hayCost);

    public String getName()   { return myName; }
    public int getWeight()    { return myWeight; }
    public int getNumCorn()   { return myNumCorn; }
    public int getNumHayBales() { return myNumHayBales; }
    public void setName(String name)  { myName = name; }
    public void setWeight(int weight)  { myWeight = weight; }
    public void setNumCorn(int corn)  { myNumCorn = corn; }
    public void setNumHayBales(int hay)  { myNumHayBales = hay; }

    public double getFeedCost(double cornCost, double hayCost)
        { return (myNumCorn * cornCost) + (myNumHayBales * hayCost); }
}

