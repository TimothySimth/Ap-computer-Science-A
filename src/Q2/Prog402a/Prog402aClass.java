package Q2.Prog402a;

public class Prog402aClass {
    int myID;
    int myScore;
    static double myAverage = 0.0;

    public Prog402aClass(int id, int score) {
        myID = id;
        myScore = score;
        myAverage += score;
    }

    public int getId() { return myID;}
    public double getAverage() { return  myAverage; }
    public int getScore() { return myScore; }



}
