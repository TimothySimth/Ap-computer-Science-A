package Q1;

public class Lp514 {
    public static void main(String[] args) {
        int lcv = 0;
        System.out.println("Dice1\tDice2\tSum");
        while (lcv < 5) {
            int dice1 = (int)(Math.random() * (6 - 1)) + 1;
            int dice2 = (int)(Math.random() * (6 - 1)) + 1;
            lcv ++;
            int sum = dice1 + dice2;
            System.out.println(dice1 + "\t\t" +dice2 + "\t\t" +sum);
            


        }
    }

}
/*
Dice1   Dice2   Sum
5       4       9
1       4       5
4       4       8
5       1       6
1       2       3
*/