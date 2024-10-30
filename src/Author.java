import java.math.BigDecimal;        //  I am using this lib to round my calcRoyalty function
import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    // Attributes
    private String name;
    private ArrayList<Title> titles;

    // Constructor
    public Author() {
    }   // end constructor

    // Constructor
    public Author(String name) {
        // Declaring the attribute name;
        this.name = name;
        // instantiate a new ArrayList in the attribute titles.
        this.titles = new ArrayList<>();
    }   // end constructor

    // Constructor
    public Author(String name, ArrayList<Title> titles) {
        // Declares the parameter as an attribute
        this.name = name;
        // Delcares the parameter as an attribute
        this.titles = titles;
    }   // end constructor

    public void addTitle(Title title) {
        // Adding a PrintedBook or AudioBook to an Authors list of titles
        this.titles.add(title);
    }   // end addTitle method

    public float calculateTotalPay(){
        /*
        Iterating through an Authors ArrayList of titles
        add each titles earning to the local variable total.
         */
        float total = 0;
        for (Title title : this.titles) {
            // I am using Math.round to remove pennies
            total += title.calcRoyalty();
        }
        // Return total earnings of all titles
        return total;
    }   // end calculateTotalPay method

    public ArrayList<Title> getTitles() {
        return this.titles;
    }   // end getTitles method

    public String getName() {
        return this.name;
    }   // end getName method

    public void setName(String name) {
        this.name = name;
    }   // end setName method

    @Override
    public String toString() {
        /*
            When I call the Author Object it returns the authors name and earnings.
            I have instantiated the variable 'valueRounded' to round up an Authors
            earnings to 2 decimals places
         */
        BigDecimal valueRounded = new BigDecimal(calculateTotalPay()).setScale(2, BigDecimal.ROUND_HALF_UP);
        return getName() + " has earned " + valueRounded + " USD";
    }   // end toString method
}   // end class
