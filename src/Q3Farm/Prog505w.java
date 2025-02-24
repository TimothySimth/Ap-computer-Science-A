package Q3Farm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog5052.dat"));
            List<Animal> animals = new ArrayList<>();

            // TODO: Read in animals

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
