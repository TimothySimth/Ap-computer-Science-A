package Q3.ABCLab;

import java.util.Scanner;

public class ABCLab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("C Radius: ");
        double r = kbd.nextDouble();
        Shape s1 = new Circle(r);

        System.out.print("R Height: ");
        double rh = kbd.nextDouble();
        System.out.print("R Width: ");
        double rw = kbd.nextDouble();
        Shape s2 = new Rectangle(rh, rw);

        System.out.print("T Height: ");
        double th = kbd.nextDouble();
        System.out.print("T Width: ");
        double tb = kbd.nextDouble();
        Shape s3 = new Triangle(th, tb);

        ((Circle) s1).printClass();
        s1.calcArea();
        ((Circle) s1).calcCircumference();

        ((Rectangle) s2).printClass();
        s2.calcArea();
        s2.calcPerim();

        ((Triangle) s3).printClass();
        s3.calcArea();
        s3.calcPerim();

    }
}
/*
C Radius: 3.715
R Height: 5
R Width: 10
T Height: 13
T Width: 21
Circle
Area: 43.35782707053979
Circumference: 23.34203341617216
Rectangle
Area: 50.0
Perimeter: 30.0
Triangle
Area: 136.5
Perimeter: 58.69817807045693
*/