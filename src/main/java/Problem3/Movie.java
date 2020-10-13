package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.rating = rating;
        this.title = title;
        // homework
    }

    public Movie(Movie anotherMovie) {
        id = anotherMovie.id;
        rating = anotherMovie.rating;
        title = anotherMovie.title;
        // homework
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        Movie movie = (Movie)obj;
        if (movie.title == this.title && movie.rating == this.rating
                && movie.id == this.id) {
            return true;
        }
        return false;
    }
}

