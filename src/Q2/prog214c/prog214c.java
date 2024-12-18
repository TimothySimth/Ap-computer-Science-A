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
                String t = file.nextLine();
                double a = file.nextDouble();
                String c = file.nextLine();
                prog214cClass goHook = new prog214cClass(t, a, c);
                db.add(goHook);
                goHook.calc();
                System.out.printf("COMPSCI PETROLEUM COMPANY\n" +
                                  "-------------------------------\n" +
                                  "%d            %d Gallons $%d\n" +
                                  "-------------------------------\n" +
                                  "Gasoline                   %.2f\n" +
                                  "Wash %d                    %.2f\n" +
                                  "                           ------" +
                                  "Total Due                  %.2f",
                        goHook.getGasType(), goHook.getGasGallons(), goHook.getGasCost(), goHook.getCost(),
                        goHook.getCarWash(), goHook.getFinalCost());
            }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
