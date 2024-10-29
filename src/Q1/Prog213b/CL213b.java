package Q1.Prog213b;

import Q1.prog115b;

public class CL213b {
    private int    myQuantity;
    private double myPrice;
    private double myAmtDue;

    public CL213b(int quantity) {
        myQuantity = quantity;
        myPrice    = 0;
        myAmtDue   = 0;
    }
    public void calc(){
        if      (myQuantity >=0 && myQuantity <=99)    myPrice = 5.95;
        else if (myQuantity >99 && myQuantity <=199)   myPrice = 5.75;
        else if (myQuantity >199 && myQuantity <=299)  myPrice = 5.40;
        else if (myQuantity >299)                      myPrice = 5.15;
        myAmtDue = myPrice * myQuantity;
    }

    public String toString() {
        return String.format("Quantity: %d\tPrice: $%.2f\tAmount Due: $%.2f", myQuantity, myPrice, myAmtDue);
    }
}
