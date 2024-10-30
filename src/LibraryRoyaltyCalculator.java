public class LibraryRoyaltyCalculator extends Author{
    LibraryRoyaltyCalculator(){
        // My Author1 object is declared,
        // just as my first 3 object of the
        Author author1 = new Author("P4R4D0X"); // Create an instance of the class Author
        Title Pbook1 = new PrintedBook("Original Title", "FAG", 100, 42);                 // Index 0 of titles ArrayList
        Title Abook1 = new AudioBook("SP2","SKON", 12, 60 );                       // Index 1 of titles ArrayList
        Title Pbook2 = new PrintedBook("Andet navn","TE", 139,69 );                       // Index 2 of titles ArrayList


        // Adding 3 instances of the title object to Author1's ArrayList 'titles'
        author1.addTitle(Pbook1);
        author1.addTitle(Abook1);
        author1.addTitle(Pbook2);


        // I am creating an Author2. This time I add the titles to author2's ArrayList 'titles'
        // while instantiating them at the same time
        Author author2 = new Author("L45T PR0PH3T");
        author2.addTitle(new PrintedBook("Master Piece", "LYRIK", 137, 256));              // Index 0 of titles ArrayList
        author2.addTitle(new AudioBook("The one and only way", "BI", 1600,1024));   // Index 1 of titles ArrayList

        // read toString method in Author class
        System.out.println(author1);
        System.out.println(author2);
    }
}
