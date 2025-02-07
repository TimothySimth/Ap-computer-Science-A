package Q3.prog702p;

public class Beeper extends animal{
    String myFavWord;

    public Beeper(String n, String w, String fCost) {
        super(n, w);
        myFavWord = fCost;

    }
    public String calcMostUsedWord() {
        return "s";
    }
    public String getFavWord() { return myFavWord; }
}
