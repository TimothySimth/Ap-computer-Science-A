package Q1;

import java.util.*;

public class gradeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade a a percent: ");
        double gp = input.nextDouble();


        //boolean test = (gp >= 90);
        //System.out.println("test");

        String grade = "";
        if      (gp >= 90) grade = "A";
        else if (gp >= 80) grade = "B";
        else if (gp >= 70) grade = "C";
        else if (gp >= 60) grade = "D";
        else               grade = "F";

        System.out.println("Your grade is: " + grade);

    }
}
/*
Enter your grade a a percent: 90
Your grade is: A
*/