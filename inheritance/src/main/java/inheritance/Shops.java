package inheritance;

import java.util.LinkedList;

public class Shops implements ReviewableBuisness {
    String name;
    String description;
    int numberofDollarSigns;
    double numberOfStars;
    LinkedList<Review> allReviews = new LinkedList<>();

    public Shops(String name, String description, int numberofDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberofDollarSigns = numberofDollarSigns;

    }

    public String toString(){
        return String.format("%s is %s \n It is %d expensive.", this.name, this.description, this.numberofDollarSigns);
    }


    @Override
    public void addReview(Review review) {
        this.allReviews.add(review);
        calculateAverageReviewStars();
    }

    @Override
    public double calculateAverageReviewStars() {
        double allStars = 0;
        for (Review review : this.allReviews) {
            allStars += review.stars;
        }
        double averageStars = allStars/this.allReviews.size();
        this.numberOfStars = averageStars;

        return this.numberOfStars;
    }
}
