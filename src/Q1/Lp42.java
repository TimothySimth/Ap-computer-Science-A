package Q1;
import java.util.Scanner;

public class Lp42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Width cm:  ");
        int width = input.nextInt();
        System.out.print("Enter Length cm:  ");
        int length = input.nextInt();
        System.out.print("Enter Hight cm:  ");
        int hight = input.nextInt();
        System.out.print("Enter Weight in Kg:  ");
        int weight = input.nextInt();

        int size = length * width * hight;

        if (size <= 100000) {
            if (weight < 27){
                System.out.println("Your Package is accpted");
            }
            System.out.println("Your Package is to Heavy");

        }
        else if (weight < 27) {
            System.out.println("Your Package is to Big");
        }
        else {
            System.out.println("Your Package is To Heavy and to Big");
        }
    }

}

/*
Enter Width cm:  25
Enter Length cm:  10
Enter Hight cm:  38
Enter Weight in Kg:  32
Your Package is to Heavy 
*/