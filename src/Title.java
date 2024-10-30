import java.awt.print.Book;

public abstract class Title  {
    // Attributes
    private String title;
    protected String litatureType;
    protected int copies;
    protected double rate = 0.067574;   // this rate is meant to be multiplied by calcPoints()

    // Constructor
    Title(String title, String literatureType, int copies){
        this.title = title;
        this.litatureType = literatureType.toUpperCase();
        this.copies = copies;
    }   // end constructor

    // this method returns appropriate points based on the unique literature type
    protected  double calcLiteraturePoints(Title title){
        double result = 0;
        switch(getLiteratureType()){
            // the reason why I write f after the number is to make it float, since the default is double
            case "BI":
            case "TE":
                result = 3.0;
                break;
            case "LYRIK":
                result = 6.0;
                break;
            case "SKON":
                result = 1.7;
                break;
            case"FAG":
                result = 1.0;
                break;
        }   // end switch
        if (title instanceof AudioBook){
            result /= 2;
        }   // in the cases where an instance of Title is an AudioBook. The literature Point value is halved
        return result;
    }   // end calcLiteraturePoints

   // this method calculate the amount of points a title has earned
   // based on literature type, copies, pages or durationMinutes*1/2
    protected  double calcPoints(Title title){
        // This ternarary statement changes the variable 'var' depending on the instance of the Object calling the method
        double var = (title instanceof  PrintedBook) ? getPages() :  getPages()/2;
        return calcLiteraturePoints(this)*var*this.copies;
    }

    // this method returns the total earnings of a title,
    // by multiplying calcPoints with rate.
    public  double calcRoyalty() {
        return calcPoints(this)* rate;
    }

    // returns the amount of pages each title has
    protected abstract double getPages();

    // returns the literatureType of this instance of the object Title
    public String getLiteratureType() {
        return litatureType;
    }
}
