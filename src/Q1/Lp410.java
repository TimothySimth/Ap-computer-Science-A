package Q1;

import java.util.Scanner;

public class Lp410 {
    public static void main(String[] args) {
        System.out.print("Rectangular Prism\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int length = input.nextInt();
        System.out.print("Enter the Width: ");
        int width = input.nextInt();
        System.out.print("Enter the Hight: ");
        int hight = input.nextInt();
        int volume = length * width * hight;
        System.out.println("The Volume is: " + volume);



        System.out.print("\nSphere\nEnter the Radius: ");
        int radius = input.nextInt();
        final double pi = 3.1415;
        double shervol = (pi*(radius*radius*radius)) / 6;
        System.out.printf("The Volume is: %.2f\n", shervol);

        System.out.print("\nCube\nEnter the Side length: ");
        int sidelength = input.nextInt();
        int cubevolume = sidelength * sidelength * sidelength;
        System.out.println("The Volume is: " + cubevolume);


    }

}
/*

*/