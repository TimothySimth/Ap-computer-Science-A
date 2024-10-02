package Q1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StrInt7 {
    public static void main(String[] args) {
        Scanner cool = new Scanner(System.in);

        System.out.print("Enter a str: ");
        String mytext = cool.nextLine().toLowerCase().trim();

        int vcount = 0;
        int ccount = 0;

        for (int lcv = 0; lcv < mytext.length(); lcv++) {
            char cur = mytext.charAt(lcv);
            if (cur == 'a' || cur == 'e' || cur == 'o' || cur == 'u') vcount ++;
            else if (cur != ' ') ccount ++;


        }
        System.out.printf("# of Vowels: %d\t\t# of Constants: %d\t\t", vcount, ccount);
    }
}
/*
Enter a str: Cool beans
# of Vowels: 4          # of Constants: 5
*/