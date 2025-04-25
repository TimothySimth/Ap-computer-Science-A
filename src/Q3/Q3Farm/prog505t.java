package Q3.Q3Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prog505t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505t.dat"));
            List<Animal> animals = new ArrayList<>();

            int numHay = file.nextInt();
            double costHay = file.nextDouble();
            int numCorn = file.nextInt();
            double costCorn = file.nextDouble();
            int numCows = file.nextInt();

            for (int i = 0; i < numCows; i++){
                int weight = file.nextInt();
                int milk = file.nextInt();
                int numHayEaten = file.nextInt();
                int numCornEaten = file.nextInt();
                Cow wow = new Cow("WOWTHECOW", weight, milk, numCornEaten, numHayEaten);
                animals.add(wow);
            }

            int numHorses = file.nextInt();
            for (int i = 0; i < numHorses; i++){
                int weight = file.nextInt();
                int numHayEaten = file.nextInt();
                int numCornEaten = file.nextInt();
                int numRides = file.nextInt();
                double rideCost = file.nextDouble();
                Horse fred = new Horse("FREDTHEHORSE", weight, numCornEaten, numHayEaten, numRides, rideCost);
                animals.add(fred);
            }
            double totalIncome = 0.0;
            double totalFeedCost = 0.0;
            int totalWeight = 0;
            int cornMissing = 0;
            int hayMissing = 0;
            boolean canAnimalsEat = true;

            for (Animal n: animals) {
                if (n instanceof Cow){
                    totalIncome += ((Cow) n).calcValue();
                    totalFeedCost += n.getFeedCost(costCorn, costHay);
                    totalWeight += n.getWeight();
                    }
                if (n instanceof  Horse) {
                    totalIncome += ((Horse) n).calcValue();
                    totalFeedCost += n.getFeedCost(costCorn, costHay);
                    totalWeight += n.getWeight();
                    }
                }
            System.out.printf("The total income for today was: %.2f\nThe total feed cost was: %.2f\nThe total weight is: %d\n", totalIncome, totalFeedCost, totalWeight);

          /*It should determine if there is enough food to feed all the animals, if so, feed all the animals and report
            how many bales of hay and cobs of corn are left in the barn. If there is not enough food for ALL the
            animals, none of the animals get fed ☹ - report that there is insufficient food to feed the animals
            and request an immediate shipment of hay and corn for the amount of needed of each.*/

            int totalCornNeeded = 0;
            int totalHayNeeded  = 0;

            for (Animal n : animals){
                totalCornNeeded += n.getNumCorn();
                totalHayNeeded  += n.getNumHayBales();
            }

            if (totalCornNeeded <= numCorn && totalHayNeeded <= numHay){
                numHay  -= totalHayNeeded;
                numCorn -= totalCornNeeded;
                System.out.printf("The animals have been fed.\nYou have %d corn and %d hay bales\n", numCorn, numHay);
            }
            if (totalCornNeeded > numCorn){
                System.out.printf("You need %d corn\n", Math.abs(totalCornNeeded - numCorn));
            }
            if (totalHayNeeded > numHay){
                System.out.printf("You need %d hay bales\n", Math.abs(totalHayNeeded - numHay));
            }

            int minCowIndex = 0;
            double minCowValue = Double.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int lcv = 0; lcv < animals.size(); lcv++) {
                    if (animals.get(lcv) instanceof Cow) {
                        Cow cow = ((Cow) animals.get(lcv));
                        double cowValue = cow.value(costCorn, costHay);
                        if (cowValue < minCowValue) {
                            minCowIndex = lcv;
                            minCowValue = cowValue;
                        }
                    }
                }
                animals.remove(minCowIndex);
            }

            int minHorseIndex = 0;
            double minHorseValue = Double.MIN_VALUE;
            for (int i = 0; i < 2; i++) {
                for (int lcv = 0; lcv < animals.size()-1; lcv++){
                    if (animals.get(lcv) instanceof Horse){
                        Horse horse = (Horse) animals.get(lcv);
                        double horseValue = horse.value(costCorn, costHay);
                        if (horseValue < minHorseValue) {
                            minHorseIndex = lcv;
                            minHorseValue = horseValue;
                        }
                    }
                }
                animals.remove(minHorseIndex);
            }

            animals.get(0).setWeight(1250);
            ((Cow)animals.get(0)).setMilk(80);
            animals.get(0).setNumCorn(4);
            animals.get(0).setNumHayBales(3);


            int finalNumCows = 0;
            int finalNumHorses = 0;

            for (Animal n : animals){
                if (n instanceof Cow) finalNumCows++;
                if (n instanceof Horse) finalNumHorses++;
            }

            System.out.printf("The total number of cows is: %d and the total number of horses is: %d\n", finalNumCows, finalNumHorses);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
The total income for today was: 259.40
The total feed cost was: 180.50
The total weight is: 42835
The animals have been fed.
You have 2420 corn and 939 hay bales
The total number of cows is: 12 and the total number of horses is: 8
*/