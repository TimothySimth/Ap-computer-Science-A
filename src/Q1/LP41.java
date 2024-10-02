package Q1;
import java.util.Scanner;

public class LP41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a copies: ");
        int len = input.nextInt();
        double costpercopy = 0.0;

        if (len < 100) costpercopy = 0.30;
        else if (len < 500) costpercopy = 0.28;
        else if (len < 750) costpercopy = 0.27;
        else if (len < 1000) costpercopy = 0.26;
        else costpercopy = 0.25;
        double cost = costpercopy * len;

        System.out.println("Price per copy: " + costpercopy);
        System.out.printf("Total is: %.2f\n", cost);







    
    }}


/*
Enter a number eggs: 18
Price per copy: 0.5
Total is: 0.75
*/