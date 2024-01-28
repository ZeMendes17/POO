package aula12;

public class Movie {
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int runningTime;


    // constructor
    public Movie(String name, double score, String rating, String genre, int runningTime){
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runningTime = runningTime;
    }

    // getters
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
    public int getRunningTime(){
        return runningTime;
    }

    @Override
    public String toString(){
        return String.format("%-40s%-10.1f%-10s%-10s%-15d", name, score, rating, genre, runningTime);
    }
}
