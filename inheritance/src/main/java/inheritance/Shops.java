package inheritance;

public class Shops implements ReviewableBuisness {
    String name;
    String description;
    int numberofDollarSigns;
    double numberOfStars;

    public Shops(String name, String description, int numberofDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberofDollarSigns = numberofDollarSigns;

    }

    public String toString(){
        return String.format("%s is %s \n It is %d expensive.", this.name, this.description, this.numberofDollarSigns);
    }


    @Override
    public void addReviews(Review review) {
        allReviews.add(review);
    }

    @Override
    public void calculateAverageReviewStars() {
        double allStars = 0;
        for (Review review : allReviews) {
            allStars += review.stars;
        }
        double averageStars = allStars/allReviews.size();
        this.numberOfStars = averageStars;

    }
}
