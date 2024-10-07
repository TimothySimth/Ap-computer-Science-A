package Q1.prog52aCl;

import java.util.Scanner;

public class cl52a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = input.nextInt();
        System.out.print("Enter Width: ");
        int w = input.nextInt();

        progcl52a wow = new progcl52a(l, w);
        wow.calc();
        int area = wow.getArea();
        int perim = wow.getPerim();

        System.out.println("Area is: " + area + "\nPerim is: " + perim);


    }
}
/*
Enter Length: 5
Enter Width: 10
Area is: 50
Perim is: 30
*/