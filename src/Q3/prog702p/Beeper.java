package Q3.prog702p;

public class Beeper extends animal{
    String myFavWord;
    String myFavLetter;

    public Beeper(String n, String w, String fCost) {
        super(n, w);
        myFavWord = fCost;

    }
    public void calcMostUsedLetter() {
        int[] nums = new int[27];
        String letters = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < letters.length()-1; i++) {
            int temp = 0;
            for (int i2 = 0; i2<myFavWord.length()-1; i2++){
                if (letters.substring(i, i+1).equals(myFavWord.substring(i2,i2+1))) temp += 1;
            }

            nums[i] = temp;
        }

        String strTemp = "";
        int temp = 0;

        for (int lcv = 0; lcv < nums.length-1; lcv ++) if (nums[lcv] > temp) { strTemp = letters.substring(lcv,lcv+1); temp = nums[lcv]; }

        myFavLetter = strTemp;
    }

    public String getfavLetter() { return myFavLetter; }
    public String getFavWord()   { return myFavWord; }
}
