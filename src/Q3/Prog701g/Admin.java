package Q3.Prog701g;

// Admin is child of the parent class "Person"
public class Admin extends Person{
    private String myFavW;


    public Admin(String fn, String ln, String favW) {
        super(fn, ln);  // Call the "super-class" (i.e., parent) constructor
        myFavW = favW;
    }

    public String getFavW() {return myFavW;}
}
