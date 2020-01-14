package inheritance;

import java.util.StringJoiner;

public class Review {

    public String body;
    public String author;
    public int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public String toString(){
        return String.format("Review: %s\n by %s.\n %s star rating.", this.body, this.author, this.stars);
    }
}
