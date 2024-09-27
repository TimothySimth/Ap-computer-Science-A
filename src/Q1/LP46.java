package Q1;
import java.util.Scanner;

public class LP46 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * (10 - 1)) + 1;
        int num2 = (int)(Math.random() * (10 - 1)) + 1;
        int num3 = (int)(Math.random() * (4 - 1)) + 1;
        String opp = "";

        if (num3 > 2) opp += "+";
        System.out.println(opp);
    }
}
