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
        double latefee = fin * 0.04;
        double roundlatefee = Math.round(latefee * 100.0) / 100.0;
        double pow = roundfin + roundlatefee;


        System.out.println("  COPMSIC Electric\n--------------------------------\nKilowatts USED\t\t     " + num1 + "\n--------------------------------\n\nBase rate " + num1 + " @0.0475  $" + roundchr + "\nSurcharge\t\t\t\t  $" + roundsur + "\nCitytax\t\t\t\t      $" + roundtax + "\n\t\t\t\t\t    _______\nPay This Amount           $" + roundfin + "\n\nAfter May 20th            $" + pow);

    }
}
/*
Please enter KWH used: 993

  COPMSIC Electric
--------------------------------
Kilowatts USED		     993.0
--------------------------------

Base rate 993.0 @0.0475  $47.17
Surcharge				  $4.72
Citytax				      $1.42
					    _______
Pay This Amount           $53.3

After May 20th            $55.43
*/