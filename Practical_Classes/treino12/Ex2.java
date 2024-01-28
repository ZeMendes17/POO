package treino12;

import java.util.List;
import java.util.Set;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/aula12/movies.txt"));
        ArrayList<Movie> movies = new ArrayList<>();
        Set<String> genres = new HashSet<>();
        PrintWriter out = new PrintWriter(new File("src/treino12/myselection.txt"));
        out.printf("%-40s%-10s%-10s%-10s%-15s\n", "Nane", "Score", "Rating", "Genre", "Running Time");

        for(int i = 1; i < lines.size(); i++){
            String[] tudo = lines.get(i).split("\t");

            movies.add(new Movie(tudo[0], Double.parseDouble(tudo[1]), tudo[2], tudo[3], Integer.parseInt(tudo[4])));
            genres.add(tudo[3]);

            if(tudo[3].equals("comedy") && Double.parseDouble(tudo[1]) > 60){
                out.printf("%-40s%-10s%-10s%-10s%-15s\n", tudo[0], Double.parseDouble(tudo[1]), tudo[2], tudo[3], Integer.parseInt(tudo[4]));
            }
        }
        out.close();


        movies.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        System.out.println("Filmes ordenados pelo nome: \n");
        printlist(movies);
        System.out.println();
        movies.sort((a, b) -> Double.compare(a.getScore(), b.getScore()));
        System.out.println("Filmes ordenados por Score: \n");
        printlist(movies);
        System.out.println();
        movies.sort((a, b) -> Integer.compare(a.getRuntime(), b.getRuntime()));
        System.out.println("Filmes ordenados por Run Time: \n");
        printlist(movies);
        System.out.println();


        System.out.println("Different genres: \n");
        for(String s : genres){
            System.out.println(s);
        }
    }

    public static void printlist(ArrayList<Movie> a){
        for(Movie m : a){
            System.out.println(m);
        }
    }
}
