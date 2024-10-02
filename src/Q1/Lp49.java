package Q1;
import java.util.Scanner;

public class Lp49 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * (20 - 1)) + 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number Between One and Twenty: ");
        int pnum = input.nextInt();
        if (pnum == num1) {
            System.out.println(num1 + "\n" + pnum + "\nYou Won");}
        else System.out.println(num1 + "\n" + pnum + "\nTry Again Next Time");
        
    }

}
/*
Enter a Number Between One and Twenty: 6
2
6
Try Again Next Time
*/