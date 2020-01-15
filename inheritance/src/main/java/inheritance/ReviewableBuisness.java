package inheritance;

import java.util.LinkedList;

public interface ReviewableBuisness{

    LinkedList<Review> allReviews = new LinkedList<>();
    void addReviews(Review review);
    void calculateAverageReviewStars();


}
