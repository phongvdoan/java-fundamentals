package inheritance;

import java.util.*;


public class Resturant {

    String name;
    double numberOfStars;
    String categoryOfPrice;
    LinkedList<Review> allReviews = new LinkedList<>();

    public Resturant (String name, double numberOfStars, int categoryOfPrice) {

        this.name = name;
        this.numberOfStars = numberOfStars;
        StringJoiner priceCat = new StringJoiner("");
        for( int i = 0; i < categoryOfPrice;i++) {
            priceCat.add("$");
        }
        this.categoryOfPrice = priceCat.toString();
    }


    public void addReview(Review review){
        allReviews.add(review);
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
        ;
        StringJoiner buisnessInfo = new StringJoiner("\n");
        buisnessInfo.add(String.format("Resturant: %s\n %.1f stars.\n %s price category", this.name, this.numberOfStars, this.categoryOfPrice));


        return  buisnessInfo.toString();
    }


}
