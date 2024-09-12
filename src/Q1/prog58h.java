package Q1;

import java.util.*;

public class prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount Saved: ");
        double p = input.nextDouble();

        System.out.print("Interest rate? ");
        double r = input.nextDouble();

        System.out.print("Number of times compounded per year? ");
        double n = input.nextDouble();

        System.out.print("Number of days at interest? ");
        double t = input.nextDouble();


        double a = p * Math.pow(1+((0.01*r)/n), ((n*t)/365));
        double it = a - p;

        System.out.printf("Total interest is: $%.2f\n", it);
        System.out.printf("Total saved is: $%.2f\n", a);


    }
}
/*
Amount Saved: 5000
Interest rate? 11.5
Number of times compounded per year? 365
Number of days at interest? 900
Total interest is: $1638.96
Total saved is: $6638.96
*/