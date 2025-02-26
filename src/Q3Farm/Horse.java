package Q3Farm;

public class Horse extends Animal {
    private int myNumRides;
    private double myRideCost;

    public Horse(String name, int weight, int corn, int hay, int rides, double cost) {
        super(name, weight, corn, hay);
        myNumRides = rides;
        myRideCost = cost;
    }

    public double value(double cornCost, double hayCost) {
        return myNumRides * myRideCost - getFeedCost(cornCost, hayCost);
    }
    public double calcValue() {
        return myNumRides * myRideCost;
    }

    @Override
    public String getName() {
        return super.getName() + super.getName();
    }
    public int getNumRides() {
        return myNumRides;
    }
    public double getRideCost() {
        return myRideCost;
    }

    public void setNumRides(int rides)  { myNumRides = rides; }
    public void setMyRideCost(double rideCost)  { myRideCost = rideCost; }
}
