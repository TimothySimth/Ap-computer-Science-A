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

            int numOfVehicles = 0;
            int numOfCarTires = 0;
            int numOfTruckTires = 0;
            int numOfBusTires = 0;
            String longestHomeName = "";
            double lowestTruckcost = 100000;
            int totalCarCost = 0;
            double totalAllVehiclesCost = 0;

            for (vehicles a : list) {
                if (a instanceof car) {
                    totalAllVehiclesCost += ((car) a).getCost();
                    totalCarCost += ((car) a).getCost();
                    numOfVehicles++;
                    numOfCarTires += ((car) a).getTires();
                } else if (a instanceof truck) {
                    ((truck) a).calcCost();
                    totalAllVehiclesCost += ((truck) a).getCost();
                    if (((truck) a).getCost() < lowestTruckcost) lowestTruckcost = ((truck) a).getCost();
                    numOfVehicles++;
                    numOfTruckTires += ((truck) a).getTires();
                } else if (a instanceof bus) {
                    if (longestHomeName.length() < ((bus) a).getHomeCity().length()) longestHomeName = ((bus) a).getHomeCity();
                    totalAllVehiclesCost += 50000;
                    numOfVehicles++;
                    numOfBusTires += ((bus) a).getTires();
                }
            }


            System.out.printf("The total number of vehicles is: %d\n" +
                    "The total car cost is: %d\n" +
                    "The total cost of all the vehicles is: %.2f\n" +
                    "The longest home destination name for all of the busses is: %s\n" +
                    "The truck has the least value is: %.2f\n" +
                    "The total number of tires in each of the three classes of vehicles are as follows car: %d truck: %d bus: %d",
                    numOfVehicles, totalCarCost, totalAllVehiclesCost, longestHomeName,
                    lowestTruckcost, numOfCarTires, numOfTruckTires, numOfBusTires);

        } catch (IOException e) {
            System.out.println("Error: " + e);}
    }
}
