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
        StringJoiner reviewStrings = new StringJoiner("\n");
        reviewStrings.add("\nReviews:");
        if(this.movie == null) {
            reviewStrings.add(String.format("%s said '%s", this.author, this.body));
            reviewStrings.add(String.format("%s rates %s, a %d out of 5", this.author, this.buisnessName, this.stars));
            return reviewStrings.toString();
        }
        reviewStrings.add(String.format("%s said '%s", this.author, this.body));
        reviewStrings.add(String.format("%s rates %s, a %d out of 5\n", this.author, this.movie, this.stars));
        return reviewStrings.toString();
    }
}
