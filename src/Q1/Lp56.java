package Q1;
import java.util.Scanner;

public class Lp56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Positive int: ");
        double num1 = input.nextDouble();
        

        int firstNum  = (int) (num1 / 100);
        int secondnum = (int) (num1 / 100 * 10 % 10);
        int thridnum  = (int) (num1 / 100 * 100 % 10);
        if (firstNum  <= 1) firstNum  = 0;
        if (secondnum <= 1) secondnum = 0;
        if (thridnum  <= 1) thridnum  = 0;
        int sum = (int) (firstNum + secondnum + thridnum);
        System.out.printf("%d\n%d\n%d\n%d\n",firstNum, secondnum, thridnum, sum);



    }

}
/*
Enter a Positive int: 892
8
9
2
19 
*/