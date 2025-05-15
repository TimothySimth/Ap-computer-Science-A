package Q4.LibraryManagementLab;

import java.util.ArrayList;
import java.util.Locale;

public class BinarySearchUtil {

    private ArrayList<Book> myBooks;
    private String myThing;

    public BinarySearchUtil(ArrayList<Book> books, String thing){
        myBooks = books;
        myThing = thing.toLowerCase();
    }

    public Book goHookTitle(int low, int high) {
        if (low > high) return null;
        int mid = (low+high)/2;
        if (myBooks.get(mid).getTitle().compareTo(myThing) == 0){
            return myBooks.get(mid);
        }
        if (myBooks.get(mid).getTitle().compareTo(myThing) < 0){
            return goHookTitle(low,mid-1);
        }
        else {
            return goHookTitle(mid+1,high);
        }
    }


    public Book goHookAuthor(int low, int high){
    int mid = (low+high)/2;
    if (myBooks.get(mid).getAuthor().equals(myThing)){
        return myBooks.get(mid);
    }
    else if (myBooks.get(mid).getAuthor().compareTo(myThing) > 0){
        return goHookAuthor(mid+1,high);
    }
    else {
        return goHookAuthor(low,mid-1);
    }
}

}
