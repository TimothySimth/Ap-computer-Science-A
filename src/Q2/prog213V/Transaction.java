package Q2.prog213V;

public class Transaction {
    private String myType;
    private double myAmount;

    public Transaction(String type, double amount) {
        myAmount = amount;
        myType = type;
    }

    public String getCode()   { return myType;   }
    public double getAmount() { return myAmount; }
}
