package Q3.prog702p;

public class animal implements names{
    private String myName;
    private String myWord;

    public  animal(String n, String w) {
        myName = n;
        myWord = w;
    }

    public String getName()  {return myName;}
    public String getWord() {return myWord;}
}
