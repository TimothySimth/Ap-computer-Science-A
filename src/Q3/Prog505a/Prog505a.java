package Q3.Prog505a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Prog505a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505a.dat"));
            List<BookPerson> list = new ArrayList<BookPerson>();

            while (file.hasNext()) {
                String fName = file.next();
                String lName = file.next();
                int books = file.nextInt();
                String name = fName + " " + lName;
                BookPerson wowser = new BookPerson(name, books);
                list.add(wowser);
            }

            for (int lcv=0; lcv< list.size(); lcv++) {
                BookPerson cur = list.get(lcv);
                cur.calc();
            }

            System.out.println("Reading Contest:\nName\tBooks\tPoints");
            for (BookPerson p : list) System.out.println(p);

            double tot = 0.0;
            for (BookPerson p : list) tot += p.getPoints();
            double avg = tot / list.size();
            System.out.println("\nAverage points: " + avg);

            int bestPoints = list.get(0).getPoints();
            String bestName = list.get(0).getName();
            for (int lcv = 1; lcv < list.size(); lcv++) {
                BookPerson bill = list.get(lcv);
                if (bill.getPoints() > bestPoints) {
                    bestPoints = bill.getPoints();
                    bestName = bill.getName();
                }
            }
            System.out.println("The Winner is: " + bestName);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
