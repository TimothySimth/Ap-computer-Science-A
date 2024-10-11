package Q1;

import java.util.Scanner;

public class prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a # you hate: ");
        int num1 = input.nextInt();
        System.out.println();
        System.out.println();
        System.out.println();

        int mun1 = 9 * num1;
        int mun2 = 12345679 * mun1;


        System.out.println("        9\n       x" + num1 + "\n---------\n       " + mun1 + "\nx12345679\n" + mun2 + "\nSURPRISE!!!!!");



    }
}
/*
Please enter a # you hate: 9



        9
       x9
---------
       81
x12345679
999999999
*/