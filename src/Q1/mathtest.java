package Q1;

public class mathtest {
    public static void main(String[] args) {
        int twocubed = (int)Math.pow(2, 3); // 2^3

        int num1 = 5;
        int num2 = 6;
        int num3 = 7;
        int sum = num1 + num2 + num3;
        sum /= 3; // sum = sum / 3

        num1 = num1 + 1;
        num1 += 1;
        num1++; // num1-- for sub

        // Arithmetic ops: + - * / %
        // Assignment ops:  +=  -=  *=  /=  %=  ++  --

        int test = 3/4; // equals 0 because of int division; use 3/4.0 instead oan save in a double
        System.out.println(test);

        final double PI = 3.14159;

        double myWallet = 75432.21548980;
        double myWRounded = Math.round(myWallet * 100.0) / 100.0;

        System.out.println(myWRounded);
        System.out.printf("myWRounded = %.2f\n", myWallet); // %.#f # of decimals

    }
}
