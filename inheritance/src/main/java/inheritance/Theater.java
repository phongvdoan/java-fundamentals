package inheritance;

import java.util.LinkedList;
import java.util.StringJoiner;

public class Theater implements ReviewableBuisness {
    String name;
    double stars;
    LinkedList<String> currentMovies = new LinkedList<>();
    LinkedList<Review> allReviews = new LinkedList<>();

    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movie){
        this.currentMovies.add(movie);
    }

    public void removeMovie(String movie){
        this.currentMovies.remove(movie);
    }

    public String toString(){
        StringJoiner string = new StringJoiner("\n");
        string.add(this.name);
        string.add("Current Movies showing: ");
        for(String movies : currentMovies){
            string.add(movies);
        }
        return string.toString();
    }

    @Override
    public void addReview(Review review) {
        this.allReviews.add(review);
        calculateAverageReviewStars();
    }

    @Override
    public double calculateAverageReviewStars() {
        double allStars = 0;
        for(Review review : this.allReviews){
            allStars += review.stars;
        }
        this.stars = allStars/this.allReviews.size();
        return this.stars;
    }
}
