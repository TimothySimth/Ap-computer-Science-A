package Q1;

public class prog166e {
    public static void main(String[] args) {
        int n = 0;
        int d = 1;
        double f = 0;

        // while(condition1 && condition2) are both true ... [AND]
        // while (condition1 || condition2) either one or both are true [OR]
        while (n < 16 && d <= 15) {
            n += 1;
            if (n == d) {
                d++;
                if (n != 15) {
                    n = 1;
                }
            }
            f = (double) n / d;
            System.out.printf("%d/%d\t\t%.5f\n", n, d, f);
        }
    }
}
