package Q1;

import java.util.Scanner;

public class prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter num1: ");
        int num1 = input.nextInt();
        System.out.println();

        System.out.print("Please enter num2: ");
        int num2 = input.nextInt();
        System.out.println();

        System.out.print("Please enter num3: ");
        int num3 = input.nextInt();
        System.out.println();

        System.out.print("Please enter num4: ");
        int num4 = input.nextInt();
        System.out.println();

        int sum = num1 + num2 + num3 + num4;
        int average = sum / 4;

        System.out.println("Your sum is " + sum);
        System.out.println("Your Average is " + average);
    }
}
/*
Please enter num1: 475

Please enter num2: 821

Please enter num3: 365

Please enter num4: 562

Your sum is 2223
Your Average is 555
*/