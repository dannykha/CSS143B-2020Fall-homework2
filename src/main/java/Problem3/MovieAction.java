package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        super(rating, title);
        // tip: use the 'super' keyword
    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        super(anotherMovie);
        // tip: use the 'super' keyword
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        if (numOfDaysPastDue < 5 && numOfDaysPastDue > 0) {
            return (numOfDaysPastDue * lateFeePerDayInDollar);
        }
        else if (numOfDaysPastDue >= 5) {
            return (2 * numOfDaysPastDue * lateFeePerDayInDollar);
        }
        return 0;
    }
}
