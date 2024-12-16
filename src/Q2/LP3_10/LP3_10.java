package Q2.LP3_10;

import java.util.Scanner;

public class LP3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of burgers: ");
        int burgers = input.nextInt();
        System.out.print("Enter Number of fries: ");
        int fries = input.nextInt();
        System.out.print("Enter Number of soda: ");
        int soda = input.nextInt();

        lp3_10class goHook = new lp3_10class(burgers, fries, soda);
        goHook.calc();
        double tax   = goHook.getTax();
        double total = goHook.getTotal();
        double cost  = goHook.getCost();
        System.out.printf("The cost before tax: $%.2f\nTax: $%.2f\nFinal cost: $%.2f\n", cost, tax, total);
        System.out.print("Enter amount given: ");
        double given = input.nextDouble();
        goHook.setgiven(given);
        goHook.calcChange();
        double change = goHook.getChange();
        System.out.printf("Change: $%.2f", change);
    }
}
/*
Enter Number of burgers: 2
Enter Number of fries: 5
Enter Number of soda: 5
The cost before tax: $13.78
Tax: $0.90
Final cost: $14.68
Enter amount given: 20
Change: $5.32
*/