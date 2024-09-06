package Q1;
import java.util.Scanner;

public class prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter KWH used: ");
        double num1 = input.nextDouble();
        System.out.println();

        double chr = num1 * 0.0475;
        double sur = chr * 0.1;
        double tax = chr * 0.03;
        double fin = chr + sur + tax;


        System.out.println("  COPMSIC Electric\n------------------------------\nKilowatts USED\t\t    " + num1 + "\n------------------------------\n\nBase rate " + num1 + " @0.0475 $ " + chr + "");

    }
}
