package Q2.prog214c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog214c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214c.dat"));

            ArrayList<prog214cClass> db = new ArrayList<>();
            while (file.hasNext()) {
                String t = file.next();
                double a = file.nextDouble();
                String c = file.next();
                prog214cClass goHook = new prog214cClass(t, a, c);
                db.add(goHook);
                goHook.calc();
                System.out.printf("\nCOMPSCI PETROLEUM COMPANY\n" +
                                  "-------------------------------\n" +
                                  "%s            %.2f Gallons $%.3f\n" +
                                  "-------------------------------\n" +
                                  "Gasoline                   %.2f\n" +
                                  "Wash %s                     %.2f\n" +
                                  "                           ------\n" +
                                  "Total Due                  %.2f",
                        goHook.getGasType(), goHook.getGasGallons(), goHook.getGasCost(), goHook.getCost(), c,
                        goHook.getCarWash(), goHook.getFinalCost());
            }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
COMPSCI PETROLEUM COMPANY
-------------------------------
Premium            15.00 Gallons $1.479
-------------------------------
Gasoline                   22.19
Wash N                     0.00
                           ------
Total Due                  22.19
COMPSCI PETROLEUM COMPANY
-------------------------------
Regular            21.40 Gallons $1.359
-------------------------------
Gasoline                   29.08
Wash Y                     0.00
                           ------
Total Due                  29.08
COMPSCI PETROLEUM COMPANY
-------------------------------
High Octane            7.50 Gallons $1.429
-------------------------------
Gasoline                   10.72
Wash Y                     2.00
                           ------
Total Due                  12.72
COMPSCI PETROLEUM COMPANY
-------------------------------
Regular            17.90 Gallons $1.359
-------------------------------
Gasoline                   24.33
Wash Y                     0.00
                           ------
Total Due                  24.33
*/