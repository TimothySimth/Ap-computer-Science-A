package Q3.Prog703s; import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; public class Prog703s { public static void main(String[] args) { try {
            Scanner file = new Scanner(new File("Langdat/prog703s.txt"));

            List<Computers> list = new ArrayList<>();

            int num = file.nextInt();
            while (file.hasNext()) {
                String n = file.next();
                int number = file.nextInt();
                double v = file.nextDouble();

                if (num == 1) {
                    String color = file.next();
                    Computers p = new Mac(n, number, v, color);
                    list.add(p);
                } else if (num == 2) {
                    double version = file.nextDouble();
                    Computers p = new Windows(n, number, v, version);
                    list.add(p);
                } else if (num == 3) {
                    int code = file.nextInt();
                    Computers p = new Linux(n, number, v, code);
                    list.add(p);
                }
                num = file.nextInt();
            }

            int numMGOG = 0;
            int numWV   = 0;
            int numLCF  = 0;
            for (Computers wow : list){
                if (wow instanceof Mac) {
                    if (((Mac) wow).getColor().equals("Green") || ((Mac) wow).getColor().equals("Gold")) {
                        numMGOG++;
                    }
                }
                if (wow instanceof  Windows){
                    if (((Windows) wow).myVersion == 7.0){
                        numWV++;
                    }
                }
                if (wow instanceof Linux){
                    if (((Linux) wow).hiddenCode%10 == 5){
                        numLCF++;
                    }
                }
            }

            System.out.printf("There are %d Macs that are Gold or Green.\nThere are %d Windows on version 7.0.\nThere are %d Linux with a secret number of 5.\n", numMGOG, numWV, numLCF);


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }} } /*
There are 1 Macs that are Gold or Green.
There are 2 Windows on version 7.0.
There are 4 Linux with a secret number of 5.
*/