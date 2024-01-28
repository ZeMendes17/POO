package treino12;

public class Movie {
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int runTime;

    public Movie(String name, double score, String rating, String genre, int runTime){
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runTime = runTime;
    }

    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }
    public String getRating(){
        return rating;
    }
    public String getGenre(){
        return genre;
    }
    public int getRuntime(){
        return runTime;
    }

    @Override
    public String toString(){
        return String.format("%-40s%-10.1f%-10s%-10s%-15d", name, score, rating, genre, runTime);
    }
}
