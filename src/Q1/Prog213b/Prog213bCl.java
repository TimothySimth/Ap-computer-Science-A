package Q1.Prog213b;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213bCl {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog213.txt"));

            while (file.hasNext()) {
                int qnt = file.nextInt();
                CL213b wowza = new CL213b(qnt);
                wowza.calc();
                System.out.println(wowza);

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
