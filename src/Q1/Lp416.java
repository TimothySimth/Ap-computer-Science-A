package Q1;
import java.util.Scanner;

public class Lp416 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the angle: ");
        double angle = input.nextDouble();
        angle = Math.toRadians(angle);
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        double tan = Math.tan(angle);
        
        System.out.printf("Sin = %.3f\nCos = %.3f\nTan = %.3f\n", sin, cos, tan);
    }

}
/*
Enter the angle: 30
Sin = 0.500
Cos = 0.866
Tan = 0.577
*/