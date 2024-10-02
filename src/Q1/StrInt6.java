package Q1;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class StrInt6 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = wow.nextLine().toLowerCase().trim();

        int Count = 0;

        for (int lcv = 0; lcv < text.length()-1; lcv++) {
            char cur = text.charAt(lcv);
            for (int lcv2 = 0; lcv2 < text.length(); lcv2++) {
                char cur2 = text.charAt(lcv+1);
                if (cur != cur2) { 
                    Count ++; 
                    lcv2 += text.length();} } }
        System.out.println("Number of unique characters: " + Count);
        System.out.println();

    

    }
}
/*
Enter a String: java
Number of unique characters: 3
*/