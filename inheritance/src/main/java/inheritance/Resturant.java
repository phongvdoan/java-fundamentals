package inheritance;

import java.util.*;


public class Resturant {

    String name;
    double numberOfStars;
    float categoryOfPrice;
    LinkedList<Review> allReviews = new LinkedList<>();

    public Resturant (String name, double numberOfStars, float categoryOfPrice) {

        this.name = name;
        this.numberOfStars = numberOfStars;
        this.categoryOfPrice = categoryOfPrice;
    }


    public void addReview(Review review){
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


    public String toString(){
        StringJoiner buisnessInfo = new StringJoiner("\n\n");
        buisnessInfo.add(String.format("Resturant: %s\n %.1f stars.\n %s price category", this.name, this.numberOfStars, this.categoryOfPrice));
        for(Review review : allReviews) {
            buisnessInfo.add(String.format("Review: %s\n by %s.\n %s star rating.", review.body, review.author, review.stars));
        }


        return  buisnessInfo.toString();
    }


}
