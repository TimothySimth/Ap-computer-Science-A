package Q2.LP3_9;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lp3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth Year: ");
        int year = input.nextInt();
        System.out.print("Enter your birth month: ");
        int month = input.nextInt();
        System.out.print("Enter your birth day: ");
        int day = input.nextInt();
        System.out.print("Enter this year: ");
        int myYear = input.nextInt();
        System.out.print("Enter this month: ");
        int myMonth = input.nextInt();
        System.out.print("Enter today: ");
        int myDay = input.nextInt();

        lp3_9class goHook = new lp3_9class(myYear, myMonth, myDay, day, month, year);
        goHook.calc();
        int age   = goHook.getAge();
        int sleep = goHook.getSleep();

        System.out.println("You have been alive for " + age + " day");
        System.out.println("You have sleep for " + sleep + " hours");
    }
}
/*
Enter your birth Year: 1997
Enter your birth month: 2
Enter your birth day: 12
Enter this year: 2012
Enter this month: 8
Enter today: 3
You have been alive for 5646 day
You have sleep for 45168 hours
*/