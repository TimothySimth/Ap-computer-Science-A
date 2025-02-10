package Q3.prog702p;
import Q3.Prog701g.Admin;
import Q3.Prog701g.Person;
import Q3.Prog701g.Student;
import Q3.Prog701g.Teacher;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class prog702p {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog701g.dat"));

            List<animal> list = new ArrayList<animal>();

            int num = file.nextInt();
            while (num != 99) {
                String n = file.next();
                String w = file.next();

                if (num == 1) {
                    double fur = file.nextDouble();
                    animal p = new hicca(n, w, fur);
                    list.add(p);
                } else if (num == 2) {
                    double steps = file.nextDouble();
                    animal p = new Wallie(n, w, steps);
                    list.add(p);
                } else if (num == 3) {
                    String fw = file.next();
                    animal p = new Beeper(n, w, fw);
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

            for (animal a : list) {
                if (a instanceof hicca) {
                    avrFurCost += ((hicca) a).getFurCost();
                    furCount++;
                } else if (a instanceof Wallie) {
                    avrStepsTaken += ((Wallie) a).getStepsTaken();
                    stepCount++;
                } else if (a instanceof Beeper) {
                    avrWordLen = ((Beeper) a).getFavWord().length();
                    wordCount++;
                    ((Beeper) a).calcMostUsedLetter();
                    letters += ((Beeper) a).getfavLetter();

                }
            }

            int[] nums = new int[27];
            String abcs = "abcdefghijklmnopqrstuvwxyz";

            for (int i = 0; i < abcs.length()-1; i++) {
                int temp = 0;
                for (int i2 = 0; i2<letters.length()-1; i2++){
                    if (abcs.substring(i, i+1).equals(letters.substring(i2,i2+1))) temp += 1;
                }

                nums[i] = temp;
            }

            String strTemp = "";
            int temp = 0;

            for (int lcv = 0; lcv < nums.length-1; lcv ++) if (nums[lcv] > temp) { strTemp = abcs.substring(lcv,lcv+1); temp = nums[lcv]; }

            avrFurCost /= furCount;
            avrStepsTaken /= stepCount;
            avrWordLen /= wordCount;
            int totAnimals = furCount + stepCount + wordCount;






            System.out.printf("The total number of animals is %d. \nThe number of Hicca %d. \nThe average value of the Hicca fur is: $%.1f\n" +
                               "The number of Wallies %d. \nThe average number of steps taken by the Wallies is:  %.1f\n" +
                                "The number of Beepers %d. \nThe average size of the Beepers words is:  %.1f\n" +
                                 "The most used letter in the beepers favorite word is: %s",
                                  totAnimals, furCount, avrFurCost, stepCount, avrStepsTaken, wordCount, avrWordLen,strTemp);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
