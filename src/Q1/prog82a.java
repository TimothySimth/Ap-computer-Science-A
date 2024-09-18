package Q1;

import java.util.*;

public class prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int a = input.nextInt();

        System.out.print("Enter speed of car: ");
        int g = input.nextInt();


        int p = g - a;
        double pp = p * 5.0;

        double tot = pp + 20.00;

        System.out.println("Fine -------------" + tot);


    }
}
