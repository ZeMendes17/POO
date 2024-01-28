package ex;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class VideoClub {
    private String file;
    private List<String> movies = new ArrayList<>();
    Map<Person, ArrayList<String>> tudo = new HashMap<>();

    public VideoClub(String file){
        this.file = file;
        try{
        Scanner input = new Scanner(new FileReader(file));

        while(input.hasNext()){
            String word = input.nextLine();
                movies.add(word);
        }
        input.close();
    } catch (FileNotFoundException e) {
        System.out.println("Ficheironãoexistente!");
    }

        
    }
    public VideoClub(List<String> movies){
        this.movies = movies;
    }

    // setters and getters
    public String getFile(){
        return file;
    }
    public List<String> getMovies(){
        return movies;
    }

    public void setFile(String file){
        this.file = file;
    }
    public void setMovies (List<String> movies){
        this.movies = movies;
    }

    
    

    public void randomRental(Person p){
        String filme = movies.get(randomNumber(movies.size()));

        if(!(tudo.containsKey(p))){
            tudo.put(p, new ArrayList<>(Arrays.asList(filme)));
        }else{
            tudo.get(p).add(filme);
        }
    }

    public void listRentals(){
        // for(int i = 0; i < tudo.size(); i++) {
        //     System.out.println(tudo.entrySet().toArray()[i].toString());
            
        // }

        for(int i = 0; i < tudo.size(); i++) {
            System.out.println(tudo.keySet());
            for(Person l : tudo.keySet()){
                System.out.print(l.getNome() + " (" + l.getCc() + ")\n");
                for(String j : tudo.get(l)){
                    System.out.println("\t" + j);
                }

            }
            
        }


    }

    public static int randomNumber(int max) {
		Random r = new Random();
		return r.nextInt(max); // num aleatorio ate max exclusive
	}
}
