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



            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    mat[r][c] = file.nextInt();
                }
            }


            System.out.println("Original Matrix:");
            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            int row = 0;
            for (int c = 0; c < mat[c].length; c++){
                int temp = mat[row][c];
                while (row < 5) {
                    temp += mat[row][c];
                    System.out.println(temp);
                    row++;}
                mat[5][c] = temp;
            }

            System.out.println("changed Matrix:");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}