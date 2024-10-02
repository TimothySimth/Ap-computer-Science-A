package Q1;
import java.util.Scanner;

public class prog166f {
    public static void main(String[] args) {
        int lcv =  1;
        int lcv2 = 100;
        int lcv3 = 1;
        while (lcv3 < lcv2){
            lcv3 ++;
            lcv += lcv3;
            if (lcv3 == lcv2) {
                lcv2 ++;
                System.out.printf("The Sum of %d to %d is %d\n", lcv3, lcv2, lcv);}
            if (lcv2 > 110) break;
        }
    }

}
/*
The sum of the numbers from 1 to 100 is 5050
The sum of the numbers from 1 to 101 is 5151
The sum of the numbers from 1 to 102 is 5253
The sum of the numbers from 1 to 103 is 5356
The sum of the numbers from 1 to 104 is 5460
The sum of the numbers from 1 to 105 is 5565
The sum of the numbers from 1 to 106 is 5671
The sum of the numbers from 1 to 107 is 5778
The sum of the numbers from 1 to 108 is 5886
The sum of the numbers from 1 to 109 is 5995
The sum of the numbers from 1 to 110 is 6105
*/