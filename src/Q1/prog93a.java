package Q1;
import java.util.Scanner;

public class prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter KWH used: ");
        double num1 = input.nextDouble();
        System.out.println();

        double chr = num1 * 0.0475;
        double roundchr = Math.round(chr * 100.0) / 100.0;
        double sur = chr * 0.1;
        double roundsur = Math.round(sur * 100.0) / 100.0;
        double tax = chr * 0.03;
        double roundtax = Math.round(tax * 100.0) / 100.0;
        double fin = chr + sur + tax;
        double roundfin = Math.round(fin * 100.0) / 100.0;
        double ;

        System.out.println("  COPMSIC Electric\n--------------------------------\nKilowatts USED\t\t     " + num1 + "\n--------------------------------\n\nBase rate " + num1 + " @0.0475  $" + roundchr + "\nSurcharge\t\t\t\t  $" + roundsur + "\nCitytax\t\t\t\t      $" + roundtax + "\n\t\t\t\t\t    _______\nPay This Amount           $" + roundfin + "\n\nAfter May 20th         $" +roundexfin);

    }
}
