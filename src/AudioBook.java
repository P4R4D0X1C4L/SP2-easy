import java.text.DecimalFormat; // I use this lib to force my calc functions to only have 2 decimals

public class AudioBook extends Title implements IAudioBook{
    // Attributes
    private int durationMinutes;
    private double litPoints;
    private String title;

    // Constructor
    public AudioBook(String title, String literatureType, int copies, int durationMinutes) {
        super(title, literatureType, copies);   // calls to 'Title' super-constructor
        this.durationMinutes = durationMinutes; // save the parameter durationMinutes as an attribute
        this.title = title;                     // save the parameter as an attribute within the subclass
    }   // end constructor


    @Override
    public double calcRoyalty() {
        // returns the amount of money earned by an instance of the object AudioBook.
        return calcPoints(this)*rate;
    }   // end calcRoyalty method

    @Override
    protected double getPages() {
        return durationMinutes*0.5;
    }


    @Override
    public int getDuration() {
        // returns an AudioBooks duration in minutes
        return durationMinutes;
    }   // end getDuration method
}   // end AudioBook class
