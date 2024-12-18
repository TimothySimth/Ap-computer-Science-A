package Q2.prog214c;

public class prog214cClass {
    private String myTypeGas;
    private double myGasCost;
    private double myGasGallons;
    private String myWantCarWash;
    private double myCost;
    private double myFinalCost;
    private double myCarWash;

    public prog214cClass (String gasType, double gasGallons, String wantCarWash) {
        myTypeGas = gasType;
        myGasGallons = gasGallons;
        myWantCarWash = wantCarWash;
        myCost = 0.0;
        myCarWash = 0.0;
        myGasCost = 0.0;
        myFinalCost = 0.0;
    }
    public void calc() {
        if (myTypeGas.equals("R"))     { myGasCost = 1.359; myTypeGas = "Regular"; }
        if (myTypeGas.equals("P"))     { myGasCost = 1.479; myTypeGas = "Premium"; }
        if (myTypeGas.equals("H"))     { myGasCost = 1.429; myTypeGas = "High Octane"; }
        if (myWantCarWash.equals("Y")) {
            myCarWash = 2.0;
            if (myGasGallons >= 20) myGasGallons = 0.0;
            else {
                int temp = (int)myGasGallons;
                for (double i = temp; i > 0; i--)
                    myCarWash *= 0.1;
            }
        }
        myCost = myGasCost * myGasGallons;
        myFinalCost = myCost + myCarWash;
    }

    public double getCost()       { return myCost;       }
    public double getFinalCost()  { return myFinalCost;  }
    public double getCarWash()    { return myCarWash;    }
    public double getGasCost()    {return myGasCost;     }
    public double getGasGallons() { return myGasGallons; }
    public String getGasType()    { return myTypeGas;    }
}
