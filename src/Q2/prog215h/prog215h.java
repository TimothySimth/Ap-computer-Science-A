package Q2.prog215h;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog215h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215h.dat"));
            ArrayList<prog215hcl> db = new ArrayList<>();
            int lcv = 1;
            while (file.hasNext()) {
                double num1 = file.nextDouble();
                double num2 = file.nextDouble();
                double num3 = file.nextDouble();
                double num4 = file.nextDouble();
                double num5 = file.nextDouble();
                double num6 = file.nextDouble();
                double num7 = file.nextDouble();
                double num8 = file.nextDouble();

                prog215hcl con = new prog215hcl(num1,num2,num3,num4,num5,num6,num7,num8);
                con.calc();
                double total = con.getTotal();
                System.out.printf("Contestant%d\n%.2f %.2f %.2f %.2f %.2f %.2f %.2f = %.2f\n",
                        lcv, num1, num2, num3, num4, num5, num6, num7, num8, con.getTotal());
                lcv++;

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Contestant1
8.40 9.10 8.50 8.40 9.10 8.70 8.80 = 9.10
Contestant2
7.00 7.00 7.00 7.00 7.00 7.00 7.00 = 7.00
Contestant3
8.00 7.90 8.00 8.00 8.00 8.00 8.00 = 8.10
*/