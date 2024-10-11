package Q1;
import java.util.Scanner;

public class LP46 {
    public static void main(String[] args) {
        double num1 = (int) (Math.random() * (10 - 1)) + 1;
        double num2 = (int) (Math.random() * (10 - 1)) + 1;
        double num3 = (int) (Math.random() * (5 - 1))  + 1;
        String sign = "";
        double answer = 0;
        if (num3 == 1) {
            sign += "+"; 
            answer += num1 + num2;

    
    }
        if (num3 == 2) {
            sign += "-"; 
            answer += num1 - num2;
    }
        if (num3 == 3) {
            sign += "*";
            answer += num1 * num2;
    }
        if (num3 == 4) {
            sign += "/";
            answer += num1 / num2;
        }

        if (num3 == 5) {
            sign += "%";
            answer += num1 % num2;
        }



        Scanner input = new Scanner(System.in);
        System.out.print("What does " + num1 + " " + sign + " " + num2 + " = ");
        double len = input.nextDouble();

        if (len == answer) System.out.println("Correct");
        else System.out.println("Incorrect answer was: " + answer);

    }
}
/*
What does 1 - 8 = -7
Correct
*/