package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date twoThousand = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date nineteenHundred = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Movie a = new Movie("DDLJ", new GregorianCalendar(2001, Calendar.FEBRUARY, 20).getTime(),
                Arrays.asList("Kajol", "SRK"), "Karan");
        Movie b = new Movie("K3G", new GregorianCalendar(2010, Calendar.JULY, 28).getTime(),
                Arrays.asList("SRK", "Hritik", "Kajol"), "Karen");
        Movie c = new Movie("Tokio Drift", new GregorianCalendar(2004, Calendar.JANUARY, 22).getTime(),
                Arrays.asList("VinD", "Paul"), "Max");
        Movie d = new Movie("Kal Ho Na Ho", new GregorianCalendar(2005, Calendar.JUNE, 10).getTime(),
                Arrays.asList("SRK", "Pretty"), "Karan");



        List<Movie> firstList = new ArrayList<>();
        firstList.add(a);
        firstList.add(b);

        List<Movie> newList = new ArrayList<>();
        newList.add(c);
        newList.add(d);

        Genre thriller = new Genre(firstList);
        Genre romance = new Genre(newList);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(thriller);
        genreList.add(romance);

        Netflix netflix = new Netflix(genreList);


        netflix.list.stream()
                .flatMap(genre -> genre.list.stream())
                .filter(movie -> movie.ReleaseDate.before(twoThousand))
                .forEach(movie -> movie.Title = movie.Title + "(Classic)");


        List<Movie> mov = netflix.list.stream().flatMap(genre -> genre.list.stream()).sorted(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.ReleaseDate.compareTo(o1.ReleaseDate);
            }
        }).limit(3).collect(Collectors.toList());


        List<Movie> listOfAllMovie = netflix.list.stream().flatMap(genre -> genre.list.stream()).collect(Collectors.toList());
        Predicate<Movie> dateBefore2000 = movie -> movie.ReleaseDate.before(twoThousand);
        Predicate<Movie> dateAfter1990 = movie -> movie.ReleaseDate.after(nineteenHundred);
        printMovieInRange((ArrayList<Movie>) listOfAllMovie, dateBefore2000, dateAfter1990);


        for(Movie movie : listOfAllMovie) addReleaseYear(movie);


        Collections.sort(listOfAllMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.Title.compareTo(o2.Title);
            }
        });
    }

    private static void printMovieInRange(ArrayList<Movie> res, Predicate<Movie> condition1, Predicate<Movie> condition2){
        for (Movie movie: res) {
            if(condition1.test(movie) && condition2.test(movie)){
                System.out.println(movie.Title);
            }
        }
    }

    private static void addReleaseYear(Movie movie) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy");
        String year = dayFormat.format(movie.ReleaseDate);
        movie.Title = movie.Title + year;
    }
}
