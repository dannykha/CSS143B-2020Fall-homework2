package Problem3;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        // homework
        super(rating, title);
        // tip: use the 'super' keyword
    }

    public MovieComedy(MovieComedy anotherMovie) {
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
        // homework
        if (numOfDaysPastDue > 0) {
            return numOfDaysPastDue * lateFeePerDayInDollar;
        }
        return 0;
    }
}
