package Q3.MSOE;

import java.util.Scanner;

public class MSOE_2019_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter line of text: ");
        String text = input.nextLine();
        System.out.print("Letter one: ");
        String let1 = input.next();
        System.out.print("Letter one: ");
        String let2 = input.next();

        String let1_let2 = let1 + let2;
        String let2_let1 = let2 + let1;
        System.out.println(let1_let2 + let2_let1);
        int count = 0;

        for (int lcv = 0; lcv < text.length()-1; lcv++){
            if (text.substring(lcv,lcv+2).equals(let1_let2) || text.substring(lcv,lcv+2).equals(let2_let1))
                count++;
        }

        System.out.printf("The letters %s and %s appear %d times.", let1, let2, count);
    }
}
