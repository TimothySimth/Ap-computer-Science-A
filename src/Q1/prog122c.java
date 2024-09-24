package Q1;

import java.util.Arrays;

public class prog122c {
    public static void main(String[] args) {
        int lcv = 0;
        while (lcv < 10) {
            lcv += 2;
            System.out.print(lcv + "\t" +(lcv + 1) + "\t" +(lcv * 2) + "\t" +(lcv * lcv) + "\n");
        }

    }
}
/*
2	3	4	4
4	5	8	16
6	7	12	36
8	9	16	64
10	11	20	100
*/