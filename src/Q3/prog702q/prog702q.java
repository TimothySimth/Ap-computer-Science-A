package Q3.prog702q;

import Q3.prog702p.Beeper;
import Q3.prog702p.Wallie;
import Q3.prog702p.animal;
import Q3.prog702p.hicca;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prog702q {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));

            List<vehicles> list = new ArrayList<vehicles>();

            int num = file.nextInt();
            while (num != 99) {
                String n = file.next();
                int t = file.nextInt();

                if (num == 1) {
                    int cost = file.nextInt();
                    vehicles p = new car(n, t, cost);
                    list.add(p);
                } else if (num == 2) {
                    int miles = file.nextInt();
                    vehicles p = new truck(n, t, miles);
                    list.add(p);
                } else if (num == 3) {
                    String hc = file.next();
                    vehicles p = new bus(n, t, hc);
                    list.add(p);
                }
                num = file.nextInt();
            }


            double avrFurCost = 0.0;
            double avrStepsTaken = 0.0;
            double avrWordLen = 0.0;
            int furCount = 0;
            int stepCount = 0;
            int wordCount = 0;
            String letters = "";

            for (vehicles a : list) {
                if (a instanceof car) {
                    avrFurCost += ((car) a).getFurCost();
                    furCount++;
                } else if (a instanceof truck) {
                    avrStepsTaken += ((truck) a).getStepsTaken();
                    stepCount++;
                } else if (a instanceof bus) {
                    avrWordLen = ((bus) a).getFavWord().length();
                    wordCount++;

                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);}
    }
}
