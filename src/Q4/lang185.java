package Q4;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class lang185{
    public static void main(String[] args){
        try{
        Scanner file = new Scanner(new File("Langdat/prog285b.dat"));
        System.out.println("Number Code Sales Commission");
        while (file.hasNext()){
            int person = file.nextInt();
            int code = file.nextInt();
            double sale = file.nextDouble();
            double comp = 0.0;
            double comptotal = 0.0;
            System.out.print(person + "\t" + code + "  " + sale + "  ");
            if (code == 8 || code == 5){
                comp = 0.075;
                if (sale > 5000) {
                    double temp = sale;
                    comptotal = 5000 * comp;
                    temp -= 5000;
                    comp = 0.085;
                    comptotal += temp * comp;
                } else {
                    comptotal = sale * comp;
                }
                System.out.println(comptotal);
            } else if (code == 17){
                comp = 0.095;
                if (sale > 3500) {
                    double temp = sale;
                    comptotal = 3500 * comp;
                    temp -= 3500;
                    comp = 0.12;
                    comptotal += temp * comp;
                } else {
                    comptotal = sale * comp;
                }
                System.out.println(comptotal);
            } else {
                System.out.println("Bad Code");
            }
        }
    } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Number Code Sales Commission
101     17  2250.0   213.75
103     5   4000.0   300.0
117     3   7350.0   Bad Code
118     8   7350.0   574.75
125     5   6500.0   502.5
138     17  6375.0   677.5
192     8   8125.0   640.625
203     8   3250.0   243.75
218     5   5000.0   375.0
235     5   5250.0   396.25
264     17  4150.0   410.5
291     17  750.0    71.25
*/