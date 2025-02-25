package Q3Farm;

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
                    numHay -= n.getNumHayBales();
                    numCorn -= n.getNumCorn();
                    if (numHay <= 0 || numCorn <= 0) {
                        canAnimalsEat = false;
                        cornMissing += numCorn;
                        hayMissing += numHay;
                        System.out.printf("Corn missing: %d\nHay missing: %d\n", cornMissing, hayMissing);
                    }
                }
                if (n instanceof  Horse) {
                    totalIncome += ((Horse) n).calcValue();
                    totalFeedCost += n.getFeedCost(costCorn, costHay);
                    totalWeight += n.getWeight();
                    numHay -= n.getNumHayBales();
                    numCorn -= n.getNumCorn();
                    if (numHay <= 0 || numCorn <= 0) {
                        canAnimalsEat = false;
                        cornMissing += numCorn;
                        hayMissing += numHay;
                        System.out.printf("Corn missing: %d\nHay missing: %d\n", cornMissing, hayMissing);
                    }
                }

            }


            System.out.printf("The total income for today was: %.2f\nThe total feed cost was: %.2f\nThe total weight is: %d\n", totalIncome, totalFeedCost, totalWeight);




        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
