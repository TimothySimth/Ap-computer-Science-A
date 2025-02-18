package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class prog460a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/sort.dat"));
            int[] list = new int[60];
            int count = 0;

            while (file.hasNext()) {
                list[count] = file.nextInt();
                count++;
            }
            Arrays.sort(list);

            Scanner input = new Scanner(System.in);
            int num = 0;
            while (num != -1) {
                System.out.print("Enter a number to search fo [1-100]: ");
                num = input.nextInt();
                // int index = SearchAlgs.linearSearch(list, num);
                // int index = SearchAlgs.binarySearch(list, num);
                 int index = SearchAlgs.binarySearchRec(list, num, 0, list.length-1);
                if (index == -1) System.out.println("Number does not occur in this list.");
                else System.out.println("Number occurs at index: " + index);

            }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
/*
Enter a number to search fo [1-100]: 1
Number occurs at index: 0
Enter a number to search fo [1-100]: 2
Number occurs at index: 2
Enter a number to search fo [1-100]: 3
Number occurs at index: 3
Enter a number to search fo [1-100]: 4
Number occurs at index: 4
Enter a number to search fo [1-100]: 5
Number occurs at index: 5
Enter a number to search fo [1-100]: 6
Number does not occur in this list.
Enter a number to search fo [1-100]: 7
Number does not occur in this list.
Enter a number to search fo [1-100]: 8
Number occurs at index: 6
Enter a number to search fo [1-100]: 9
Number occurs at index: 7
Enter a number to search fo [1-100]: 100
Number occurs at index: 59
Enter a number to search fo [1-100]: -1
*/