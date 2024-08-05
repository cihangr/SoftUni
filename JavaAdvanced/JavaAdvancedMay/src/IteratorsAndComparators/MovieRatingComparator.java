package IteratorsAndComparators;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie> {
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getRating().compareTo(movie2.getRating());
    }
}
