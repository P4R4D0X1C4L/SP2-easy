import java.awt.event.WindowStateListener;

public class PrintedBook extends Title {
    // Attributes
    private int pages;
    private String literatureType;
    private String title;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
        this.title = title;
    }   // end constructor



    protected double calcPoints() {
        // this is the formula to calculate points for a printed book
        return  calcLiteraturePoints(this)*this.pages*this.copies;
    }   // end calcPoints method

    @Override
    protected double getPages() {
        return this.pages;
    }
}   // end class
