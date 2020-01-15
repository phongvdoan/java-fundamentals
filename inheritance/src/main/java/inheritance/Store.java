package inheritance;

import java.util.LinkedList;

public class Store {
    String storeName;
    double numberOfStars;
    LinkedList<Review> allReviews = new LinkedList<>();

    public Store(String storeName, double numberOfStars) {
        this.storeName = storeName;
        this.numberOfStars = numberOfStars;

    }

    public void addReview(Review review) {
        allReviews.add(review);
        calculateAverageReviewStars();
    }


    public double calculateAverageReviewStars() {
        double allStars = 0;
        for (Review review : allReviews) {
            allStars += review.stars;
        }
        double averageStars = allStars/allReviews.size();
        this.numberOfStars = averageStars;
        return averageStars;
    }

}
