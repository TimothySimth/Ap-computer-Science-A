package Q1;

import java.util.Arrays;

public class prog122i {
    public static void main(String[] args) {
        System.out.println("Number \t\t Cube Root \t\t Cube");
        int lcv = -26;
        while (lcv < 25) {
            lcv += 1;
            double cuberoot = Math.round(Math.cbrt(lcv)* 10000.0) / 10000.0;

            System.out.println(lcv + "\t\t\t" + cuberoot + "\t\t\t" +(lcv * lcv * lcv));
        }
    }
}
