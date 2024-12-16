package Q2.prog213V;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class prog213V {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog213v.dat"));
            ArrayList<Transaction> list = new ArrayList<>();

            double balance = file.nextDouble();
            Bank bank = new Bank(balance);

            String code = file.next();
            while (!code.equals("W")) {
                double amount = file.nextDouble();
                Transaction coolbeans = new Transaction(code, amount);
                list.add(coolbeans);
                code = file.next();
            }

            for (int lcv = 0; lcv < list.size(); lcv++)
                bank.calc(list.get(lcv));

            System.out.println("The final balance is: $" + bank.getAmount());
            //TODO: the rest

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}












