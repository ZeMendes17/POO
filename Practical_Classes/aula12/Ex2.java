package aula12;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/aula12/movies.txt"));
        ArrayList<Movie> movies = new ArrayList<>();
		HashSet<String> genres = new HashSet<>();

        for(int i = 1; i < lines.size(); i++){
            String[] tudo = lines.get(i).split("\t");
            // String name, double score, String rating, String genre, int runningTime
            movies.add(new Movie(tudo[0], Double.parseDouble(tudo[1]), tudo[2], tudo[3], Integer.parseInt(tudo[4])));
            genres.add(tudo[3]);
        }
        // Ordenados pelo nome do filme
        movies.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        printlist(movies);

        System.out.println("\n\n");
        movies.sort((a, b) -> Double.compare(a.getScore(), b.getScore()));
        printlist(movies);

        System.out.println("\n\n");
        movies.sort((a, b) -> Integer.compare(a.getRunningTime(), b.getRunningTime()));
        printlist(movies);

        System.out.println("\n\n");
        System.out.println("All genres:\n");
        for(String m: genres){
            System.out.println(m);
        }

        PrintWriter out = new PrintWriter(new File("src/aula12/myselection.txt"));
        out.printf("%-40s%-10s%-10s%-10s%-15s\n", "Name", "Score", "Rating", "Genre", "Run Time");
        out.println();
        for(Movie m: movies){
            if(m.getScore() > 60.0 && m.getGenre().equals("comedy"))
                out.println(m);
        }
        out.close();

    }

    public static void printlist(ArrayList<Movie> list){
		for(Movie m: list) {
			System.out.println(m);
		}
	}
    
}
