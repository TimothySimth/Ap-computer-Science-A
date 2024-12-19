package Q2.Prog410t;

public class prog410tClass {
    private int myId;
    private int myIncome;
    private int myMembers;
    private double myPoverty;

    public prog410tClass(int id, int income, int members) {
        myId      = id;
        myIncome  = income;
        myMembers = members;

    }

    public void calc(){
        myPoverty = 3750.00 + 750.00 * (myMembers-2);
        if (myIncome >= myPoverty){

        }
    }


}
