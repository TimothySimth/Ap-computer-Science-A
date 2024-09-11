package Q1;

public class PROG88A {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * (13 - 1)) + 1;
        int num2 = (int)(Math.random() * (20 - 2)) + 2;

        int sum = num1 + num2;
        int dif = num1 - num2;
        int prd = num1 * num2;
        int avr = sum / 2;
        int abs = Math.abs(dif);
        int max, min;

        if (num1 > num2) { max = num1; }
        else {max = num2; }
        if (max == num2) {min = num2;}
        else {min = num1;}

        System.out.println("Original numbers are " + num1 + " and " + num2 + "\nSum is " + sum + "\nDifference is " + dif + "\nProduct is " + prd + "\nAverage is " + avr + "\nAbsolute value is " + abs + "\nMax is " + max + "\nMin is " + min);



    }

}
/*
Original numbers are: 9 and 4
Sum is: 13
Difference is: 5
Product is: 36
Average is: 6
Absolute value is: 5
Max is: 9
Min is: 9
*/