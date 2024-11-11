package Q1;

import java.util.Scanner;

public class Lp517 {
    public static void main(String[] args) {
        String secretpassword = "Password";
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome ");
        
        for (int lcv=1;lcv < 4; lcv++) {
            System.out.print("Enter Password: ");
            String userinput = input.nextLine();
            if (secretpassword.equals(userinput)) {
                lcv += 10;
                System.out.println("Correct, Access Granted");
            }
            else if (lcv == 3) System.out.println("Access Denied");
            else if (lcv <= 3)System.out.println("Wrong");
        }
    }

}
/*
Welcome Enter Password: Programmer
Wrong
Enter Password: 45gsd%^
Wrong
Enter Password: efjsdf%*$kdsdf
Access Denied
*/