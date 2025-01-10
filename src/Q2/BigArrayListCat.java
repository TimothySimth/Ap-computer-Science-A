package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BigArrayListCat {
    public static void printCat(cat cat) {
        System.out.printf("%s\t%.2f\t%d\t$%.2f\n",
                            cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
    }
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = file.nextInt();
            file.nextLine();
            ArrayList<cat> cats = new ArrayList<>();
            for (int lcv = 0; lcv < numCats; lcv++) {
                String n = file.nextLine();
                double w = file.nextDouble();
                int    a = file.nextInt();
                double c = file.nextDouble();
                file.nextLine();
                cats.add(new cat(n, w, a, c));

            }
            System.out.println();

            //1. Print out all the cats (there is no toString() available).
            System.out.println("1. All the cats");
            System.out.println("Name\tWeight\tAge\tCost");
            for (cat cat : cats)
                printCat(cat);

            //2. Print the name of the 3rd cat.
            System.out.println("\n2. The third cat is named: " + cats.get(2).getName());

            //3. The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.
            cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight()+10);
            System.out.println("\n3. The updated weight is: " + cats.get(cats.size()-1).getWeight());
            System.out.println();

            //4. The cat named Rascal died. Find that cat and remove it from the list.
            for (int i = 0; i < cats.size(); i ++)
                if (cats.get(i).getName().equals("Rascal")) cats.remove(i);

            //5. A new kitten was brought in (Angel, 3.6, 1, 25.99).  Insert it into the 2nd cell.
            cats.add(1, new cat("Angel", 3.6, 1, 25.99));

            // 6.  new geriatric cat was found (Gimpy, 14.3, 10,  29.99). Put him on the list.
            cats.add(new cat("Gimpy", 14.3, 10,  29.99));

            //7. Print the updated list with a for-each loop
            System.out.println("7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (cat cat : cats)
                printCat(cat);
            System.out.println();

            //8. Replace the 3rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list.
            cat third = cats.get(2);
            cats.set(2, new cat("Sugar", 23.6, 7, 33.25));
            cats.add(third);

            //9. Switch the 2nd and 4th cats.
            cat temp = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, temp);

            //10. Print the names of the cats on the list.
            System.out.println("10. The current cat names are");
            for (cat cat : cats)
                System.out.println(cat.getName() + "\t");
            System.out.println();

            //11. Remove all cats under $26. Print the costs of each cat remaining on the list.
            for (int i = 0; i < cats.size(); i ++) {
                if (cats.get(i).getCost() < 26) {
                    cats.remove(i);
                    i--;
                }
            }
            System.out.println("11. The cost of the remaining cats are: ");
            for (cat cat : cats)
                System.out.print(cat.getCost() + "\t");
            System.out.println();

            //12. All cats heavier than 15 pounds need to go on a diet <--  no for-each this time.
            //    Print the names of the cats being put on a diet.
            System.out.println("12. The cats being put on a diet are: ");
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                cat c = cats.get(lcv);
                if (c.getWeight() > 15)
                    System.out.print(c.getName() + "\t");
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
