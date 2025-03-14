package Q3.MSOE;

import java.util.Scanner;

public class MSOE_2022_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Inputs: ");
        int n = input.nextInt();
        System.out.println("Enter seashells: ");
        double buckets = 0.0;

        for (int i = 0; i < n; i++){
            buckets+= (double) input.nextInt()/100;
        }


        System.out.printf("You need %.0f bucket for this order", buckets);
    }
}
