package ex;

import java.util.ArrayList;
import java.util.List;


public class VideoClubTester {
    public static void main(String[] args) {

        List<String> movies = new ArrayList<String>();
        movies.add("CODA");
        movies.add("Nomadland");
        movies.add("Parasite");
        movies.add("Green Book");
        movies.add("The Shape of Water");
        movies.add("Moonlight");
        movies.add("Spotlight");
        movies.add("Birdman or (The Unexpected Virtue of Ignorance)");
        
        movies.add("12 Years a Slave");
        movies.add("Argo");
        movies.add("The Artist");
        movies.add("The King's Speech");
        movies.add("The Hurt Locker");
        movies.add("Slumdog Millionaire");
        movies.add("No Country for Old Men");
        movies.add("The Departed");
        
        // Two different constructors
        // 1. One receives the list of movies
        // 2. The other receives a path to a CSV file and reads the movie list
        //VideoClub videoClub = new VideoClub(movies);
        VideoClub videoClub = new VideoClub("movies.csv");

        List<Person> r = new ArrayList<Person>();
        r.add(new Person("Joao", 1231245, new DateYMD(1, 1, 2000)));
        r.add(new Person("Carlos", 23424, new DateYMD(1, 10, 2003)));
        r.add(new Person("Marta", 3423, new DateYMD(31, 3, 2002)));
        r.add(new Person("Ricardo", 786675, new DateYMD(14, 7, 2000)));
        r.add(new Person("Paula", 65423, new DateYMD(3, 6, 2001)));

        // selecionar aleatoriamente um leitor, que receberá um livro aleatório
        // os livros disponíveis estão listatos no ficheiro 'books.csv', no formato 'titulo;autor;ano'
        for (int i=0; i<30; i++) {
            int ri = (int) (Math.random()*r.size());
            videoClub.randomRental(r.get(ri));
        }

        videoClub.listRentals();
    }
}
