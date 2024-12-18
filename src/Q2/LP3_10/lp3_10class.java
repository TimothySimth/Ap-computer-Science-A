package Q2.LP3_10;

public class lp3_10class {
    private double myBurgers;
    private double myFries;
    private double mySoda;
    private double myCost;
    private double myTax;
    private double myChange;
    private double myGiven;
    private double myTotal;

    public lp3_10class(int burgers, int fries, int soda) {
        myBurgers = burgers;
        myFries   = fries;
        mySoda    = soda;
        myTax     = 0;
        myChange = 0;
        myGiven = 0;
        myTotal = 0;
    }
    public void calc() {
        myBurgers *= 1.69;
        myFries   *= 1.09;
        mySoda    *= 0.99;
        myCost     = myBurgers + mySoda + myFries;
        myTax      = myCost * 0.065;
        myTotal    = myTax + myCost;
    }
    public void calcChange() { myChange = Math.abs(myTotal - myGiven);}

    public void setgiven(double given)  {myGiven = given;}

    public double getTax()        {return myTax;   }
    public double getTotal()      {return myTotal; }
    public double getCost()       {return myCost;  }
    public double getChange()     {return myChange;}

}
