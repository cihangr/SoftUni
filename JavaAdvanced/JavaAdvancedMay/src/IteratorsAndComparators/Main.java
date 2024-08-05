package IteratorsAndComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*printName ("Ivan");
        printName ("Desi", "Ivan");
        printName ("Ivan", "Desi", "Gosho", "Pavel", "Peci");*/

        List<Movie> movies = new ArrayList<>();

        Movie movie1 = new Movie("Furiosa", 70.0, 7.9);
        Movie movie2 = new Movie("Kingdom of Apes", 2.0, 7.2);
        Movie movie3 = new Movie("Dune 2", 45.0, 9.8);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        Collections.sort(movies, new MovieRatingComparator().reversed());


        movies.forEach(System.out::println);



    }
    // Vargars ... adding three dots, will make it like array.
    /*private static void printName (String teacher, String... names) {
        System.out.println("Teachher: "+ teacher);
        for (String name : names) {
            System.out.println(name);
        }
    }*/
}
