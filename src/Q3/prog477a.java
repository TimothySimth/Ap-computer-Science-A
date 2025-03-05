package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog477a.dat"));
            int[][] mat = new int[4][4];

            for (int r = 0; r < mat.length; r++){
                for (int c = 0; c < mat[r].length-1; c++){
                    if (file.nextInt() == 1) {
                        if (file.nextInt() == 1) mat[0][0]++;
                    }
                }
            }



        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
