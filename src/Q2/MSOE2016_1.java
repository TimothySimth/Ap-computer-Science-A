package Q2;

import java.util.Locale;
import java.util.Scanner;

public class MSOE2016_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userword = input.nextLine().toLowerCase();



        //if (word.equals(userword)) System.out.println(userword + " is a palindrome.");
        System.out.println(userword + " is not a palindrome.");
    }

}
