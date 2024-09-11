package Q1;

import java.util.Scanner;

public class prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter KWH used: ");
        double p = input.nextDouble();

        System.out.print("Please enter KWH used: ");
        double r = input.nextDouble();

        System.out.print("Please enter KWH used: ");
        double n = input.nextDouble();

        System.out.print("Please enter KWH used: ");
        double t = input.nextDouble();

        double a = p * (1+ Math.pow(((n*t)/365), ((0.01*r)/n)));
        double ap = a + p;

        System.out.println(a);
        System.out.println(ap);

    }
}
