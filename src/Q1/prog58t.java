package Q1;

import java.util.*;

public class prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double a = input.nextDouble();

        System.out.print("Enter money given: ");
        double g = input.nextDouble();

        double pennie = 0;
        double nickle = 0;
        double dime   = 0;
        double quarter= 0;
        double dollar = 0;

        double ch = g - a;
        System.out.printf("change due: $%.2f\n", ch);

        while (ch > 0) {
            if (ch >= 1) {
                ch -= 1;
                dollar += 1;
            } else if (ch >= 0.25) {
                ch -= 0.25;
                quarter += 1;
            } else if (ch >= 0.1) {
                ch -= 0.1;
                dime += 1;
            } else if (ch >= 0.05) {
                ch -= 0.05;
                nickle += 1;
            } else if (ch >= 0.01) {
                ch -= 0.01;
                pennie += 1;
            }
            else {
                ch = 0;
            }
        }


        System.out.println("_____________________\nDollars\t\t" + dollar + "\nQuarters\t" + quarter + "\nDimes\t\t" + dime + "\nNickels\t\t" + nickle + "\nPennies\t\t" + pennie);




    }
}
/*
Enter amount: 125.32
Enter money given: 140
change due: $14.68
_____________________
Dollars		14.0
Quarters	2.0
Dimes		1.0
Nickels		1.0
Pennies		3.0
*/