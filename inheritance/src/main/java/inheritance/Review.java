package inheritance;

import java.util.StringJoiner;

public class Review {

    public String body;
    public String author;
    public int stars;
    String buisnessName;
    String movie;

    public Review(String body, String author, int stars, String buisnessName) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.buisnessName = buisnessName;
    }

    public Review(String body, String author, int stars, String buisnessName, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.buisnessName = buisnessName;
        this.movie = movie;
    }

    public String toString(){
        if(this.movie == null) {
            return String.format("Review: %s , %s\n by %s.\n %s star rating.\n", this.buisnessName, this.body, this.author, this.stars);
        }
        return String.format("Review: %s , %s\n by %s.\n %s star rating.\n", this.movie, this.body, this.author, this.stars);
    }
}
