package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog901a {
    public static void main(String[] args) {
        try {

            Scanner file = new Scanner(new File("Langdat/prog512h.dat"));
            String par = "";
            for (int lcv = 0;file.hasNext(); lcv++) {
                par += file.next() + " ";
                if (lcv == 4){
                    par += "\n";
                    lcv = 0;
                }
            }
            printFile(par);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }


    public static void printFile(String input){
        System.out.println(input + "\n" + reverseString(input));
    }
    public static String reverseString(String s){
        if (s.length() == 0 ) return s.substring(s.length());
        return reverseString(s.substring(1)) + s.substring(0,1);
    }
}
/*
Good morning life and all
Things glad and beautiful
My pockets nothing hold
But he that owns
the gold The sun
is my great friend
His spending has no
end Hail to the
morning sky Which bright
clouds measure high Hail
to you birds whose
throats Would number leaves
by notes Hail to
you shady bowers And
you green fields of
flowers Hail to you
women fair That make
a show so rare
In cloth as white
as milk Be it
calico or silk Good
morning life and all
Things glad and beautiful


 lufituaeb dna dalg sgnihT
 lla dna efil gninrom
 dooG klis ro ocilac
 ti eB klim sa
 etihw sa htolc nI
 erar os wohs a
 ekam tahT riaf nemow
 uoy ot liaH srewolf
 fo sdleif neerg uoy
 dnA srewob ydahs uoy
 ot liaH seton yb
 sevael rebmun dluoW staorht
 esohw sdrib uoy ot
 liaH hgih erusaem sduolc
 thgirb hcihW yks gninrom
 eht ot liaH dne
 on sah gnidneps siH
 dneirf taerg ym si
 nus ehT dlog eht
 snwo taht eh tuB
 dloh gnihton stekcop yM
 lufituaeb dna dalg sgnihT
 lla dna efil gninrom dooG
*/