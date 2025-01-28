import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class prog470a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] arr = new int[6][5];
            int col = 0;
            int row = 0;

            while (file.hasNext()) {
                int temp = file.nextInt();
                arr[col][row] = temp;
                if (row == 4) {row = 0; col++;}
                row++;
            }
            

            System.out.println(Arrays.toString());

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}