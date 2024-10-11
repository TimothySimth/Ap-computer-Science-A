package Q1;
import java.util.Scanner;

public class LP55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Positive int: ");
        String nums = input.nextLine();
        System.out.println(nums.substring(0,1) + "\n" + nums.substring(1,2) + "\n" + nums.substring(2,3) ); 
    }

}
/*
Enter a Positive int: 546
5
4
6
*/