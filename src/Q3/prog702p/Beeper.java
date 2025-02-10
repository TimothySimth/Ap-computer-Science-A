package Q3.prog702p;

import java.util.Locale;

public class Beeper extends animal{
    String myFavWord;

    public Beeper(String n, String w, String fWord) {
        super(n, w);
        myFavWord = fWord;

    }



    public String getFavWord() { return myFavWord; }
}
