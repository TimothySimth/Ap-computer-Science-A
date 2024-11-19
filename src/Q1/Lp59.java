package Q1;

public class Lp59 {
    public static void main(String[] args) {
        System.out.println("^1\t^2\t^3\t^4\t^5");
        for (int lcv = 0; lcv < 6; lcv++) {
            System.out.println(lcv + "\t" + lcv*lcv + "\t" + (int) (Math.pow(lcv, 3)) + "\t" + (int) (Math.pow(lcv, 4)) + "\t" + (int) (Math.pow(lcv, 5)));
            
        }

    }

}
/*
^1      ^2      ^3      ^4      ^5
1       1       1       1       1
2       4       8       16      32
3       9       27      81      243
4       16      64      256     1024
5       25      125     625     3125
6       36      216     1296    7776
*/