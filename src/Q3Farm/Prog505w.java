package Q3Farm;

import Q3Farm.Animal;
import Q3Farm.Cow;
import Q3Farm.Horse;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<>();

            int hay = file.nextInt();
            double hayCost = file.nextDouble();
            int corn = file.nextInt();
            double cornCost = file.nextDouble();

            int cowRows = file.nextInt();
            int cowPens = file.nextInt();
            for (int r = 0; r < cowRows; r++){
                for (int p = 0; p < cowPens; p++){
                    String name = file.next();
                    int weight = file.nextInt();
                    int milk = file.nextInt();
                    int hayEaten = file.nextInt();
                    int cornEaten = file.nextInt();
                    Cow wow = new Cow(name, weight, milk, cornEaten, hayEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = file.nextInt();
            int horsePens = file.nextInt();
            for (int r = 0; r < horseRows; r++){
                for (int p = 0; p < horsePens; p++){
                    String name = file.next();
                    int weight = file.nextInt();
                    int hayEaten = file.nextInt();
                    int cornEaten = file.nextInt();
                    int rides = file.nextInt();
                    double rideCost = file.nextDouble();
                    Horse fred = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                    animals.add(fred);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }
            //TODO: report income of the day, cumulative weight of all animals
            int totalWeight = 0;
            double totalIncome = 0.0;
            for(Animal n : animals){
                if (n instanceof Cow){
                    totalWeight += ((Cow) n).getWeight();
                    totalIncome += ((Cow) n).value(cornCost, hayCost);
                }
                if (n instanceof Horse){
                    totalWeight += ((Horse) n).getWeight();
                    totalIncome += ((Horse) n).value(cornCost, hayCost);
                }
            }

            //TODO: if there's enough food to feed all, cow that makes the most money
            boolean isFoodEnough = true;
            if (hay < 0 || corn < 0) isFoodEnough = false;

            int maxCowIndex = 0;
            double maxCowValue = Double.MIN_VALUE;
            for (int lcv = 0; lcv < animals.size(); lcv++){
                if (animals.get(lcv) instanceof Cow){
                    Cow cow = (Cow) animals.get(lcv);
                    double cowValue = cow.value(cornCost, hayCost);
                    if (cowValue > maxCowValue) {
                        maxCowIndex = lcv;
                        maxCowValue = cowValue;
                    }
                }
            }


            int minHorseIndex = 0;
            double minHorseValue = Double.MAX_VALUE;
            for (int lcv = 0; lcv < animals.size(); lcv++){
                if (animals.get(lcv) instanceof Horse){
                    Horse horse = (Horse) animals.get(lcv);
                    double horseValue = horse.value(cornCost, hayCost);
                    if (horseValue < minHorseValue) {
                        minHorseIndex = lcv;
                        minHorseValue = horseValue;
                    }
                }
            }
            System.out.printf("Horse %s makes the least money\n" +
                    "The total cumulative weight of all the animals is: %d\n" +
                    "The total income of all the animals is: %.2f\n" +
                    "Is there enough food for all the animals: %b\n" +
                    "Cow %s makes the most money.\n",
                    animals.get(minHorseIndex).getName(),
                    totalWeight,
                    totalIncome,
                    isFoodEnough,
                    animals.get(maxCowIndex).getName());

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}