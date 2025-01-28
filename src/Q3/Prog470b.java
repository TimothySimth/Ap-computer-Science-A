package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] arr = new int[3][4];
            int col = 0;
            int row = 0;

            while (file.hasNext()) {
                int temp = file.nextInt();
                arr[col][row] = temp;


            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
