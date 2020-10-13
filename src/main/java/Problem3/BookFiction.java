package Problem3;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;


    public BookFiction(String title, String author, String genres) {
        super(title, author);
        // tip: use the 'super' keyword
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        super(anotherBook);

        // tip: use the 'super' keyword
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        if (numOfDaysPastDue > 0) {
            return numOfDaysPastDue * lateFeePerDayInDollar;
        }
        return 0;
    }
}

