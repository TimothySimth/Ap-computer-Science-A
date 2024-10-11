package Q1;

import java.util.Scanner;

public class Lp517 {
    public static void main(String[] args) {
        String secretpassword = "Password";
        int lcv = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome ");
        
        while (lcv < 3) {
            System.out.print("Enter Password: ");
            String userinput = input.nextLine();
            lcv++;
            if (secretpassword.equals(userinput)) System.out.println("Correct");
            if (lcv == 3) System.out.println("Access Denied");
            else System.out.println("Wrong");
        }
    }

}
/*
Welcome Enter Password: Programer
Wrong
Enter Password: 45gsd%^
Wrong
Enter Password: efjsdf%*$kdsdf
Access Denied
*/