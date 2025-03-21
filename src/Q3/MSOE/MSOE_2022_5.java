package Q3.MSOE;

import Q3.Prog505a.BookPerson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MSOE_2022_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Inputs: ");
        int n = input.nextInt();
        System.out.print("Enter seashells: ");
        List<shells> list = new ArrayList<>();
        int num = input.nextInt();
        shells shell = new shells(num);
        list.add(shell);





        System.out.println(list.size());
    }
}




class shells {

    int myBuketWeight;
    final int MAX = 100;


    public shells(int buketWeight){
        myBuketWeight = buketWeight;
    }

    public int getBuketWeight() { return myBuketWeight; }

    public void setBuketWeight(int buketWeight) { myBuketWeight = buketWeight; }


}
