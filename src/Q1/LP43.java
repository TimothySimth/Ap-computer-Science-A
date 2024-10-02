package Q1;

import java.util.Scanner;

public class LP43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number eggs: ");
        int len = input.nextInt();
        double costperdozen = 0.0;
        int eggs = len % 12;
        int dozens = len / 12;

        if (dozens < 4) costperdozen = 0.50;
        else if (dozens < 6) costperdozen = 0.45;
        else if (dozens < 11) costperdozen = 0.40;
        else costperdozen = 0.35;

        double cost = dozens * costperdozen;
        double costs = costperdozen * eggs * 1/12;
        cost += costs;


        System.out.println("Price per copy: " + costperdozen);
        System.out.println("Total is: " + cost);
    }
}
/*
Enter a number eggs: 18
Price per copy: 0.5
Total is: 0.75
*/