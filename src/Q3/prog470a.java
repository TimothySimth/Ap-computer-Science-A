package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class prog470a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[6][5];



            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    mat[r][c] = file.nextInt();
                }
            }


            System.out.println("Original Matrix:");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }

           //for (int c = 0; c < mat.length; c++) {
           //    for (int r = 0; r < mat[c].length; r++) {
           //        int temp = 0;
           //        if (r == mat.length-1 || r == 0) temp += mat[r][c];
           //        else if (c == mat[0].length-1 || c == 0) temp += mat[r][c];

           //    }

           //}


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}