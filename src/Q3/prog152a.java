package Q3;

public class prog152a {
    public static void main(String[] args) {
        System.out.println(sumOfThrees(9669));
    }

    public static int sumOfThrees(int n){
        if (n == 3) return 3;
        return sumOfThrees(n-3) + n;
    }
}
/*15586428*/