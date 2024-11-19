package Q1.prog88aCl;

import Q1.Prog213b.CL213b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog88a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog82a.dat"));

            while (file.hasNext()) {
                int qnt  = file.nextInt();
                int qnt2 = file.nextInt();
                Cl88a wowza = new Cl88a(qnt, qnt2);
                wowza.calc();
                System.out.println(wowza);

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
