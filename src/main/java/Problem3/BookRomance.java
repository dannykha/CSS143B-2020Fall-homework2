package Problem3;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        // homework
        super(title, author);
        // tip: use the 'super' keyword
    }

    public BookRomance(BookRomance anotherBook) {
        // homework
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
