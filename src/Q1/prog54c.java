package Q1;

import java.util.Scanner;

public class prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Please enter Radius: ");
        double rad = input.nextDouble();
        System.out.println();

        double circ = 2 * PI * rad;
        double area = PI * Math.pow(rad, 2);

        System.out.println("Area is: " + area);
        System.out.println("Circumference is: " + circ);
    }

}
/*
Please enter Radius: 3.712

Area is: 43.28779268096
Circumference is: 23.32316416
*/

