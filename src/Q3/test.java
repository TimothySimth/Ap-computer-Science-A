package Q3;

public class test {
    public static int gcf(int a, int b){
        if (a % b == 0) return a;
        return gcf(b, a%b);
    }

    public static void reduceFraction(int numerator, int denominator){
        int gf = gcf(numerator, denominator);
        System.out.println(numerator/gf + "/" + denominator/gf);
    }

    public static void main(String[] args) {
        reduceFraction(7, 3);
    }

}
