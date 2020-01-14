package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ResturantTest {
    Resturant testResturant;
    @Before
    public void setUp(){
        testResturant = new Resturant("Mickey D's", 3, 2);
    }

    @Test
    public void testResaurantConstructorAndToString() {

        assertEquals("The constructor and toString method broke.", "Resturant: Mickey D's\n" +
                " 3.0 stars.\n" +
                " $$ price category", testResturant.toString());
    }

    @Test
    public void testResaurant_AddReviewAndOutput() {
        Review newTestReview = new Review("It was pretty good", "Mani", 4);
        Review newTestReviewtwo = new Review("It was good", "Jane", 5);
        testResturant.addReview(newTestReview);
        testResturant.addReview(newTestReviewtwo);
        assertEquals("new Reviews are not adding to LinkedList of reviews", "[Review: It was pretty good\n" +
                " by Mani.\n" +
                " 4 star rating., Review: It was good\n" +
                " by Jane.\n" +
                " 5 star rating.]", testResturant.allReviews.toString());
    }

    @Test
    public void testResaurant_AddReviewsAndGetAverage() {
        Review newTestReview = new Review("It was pretty good", "Mani", 4);
        Review newTestReviewtwo = new Review("It was good", "Jane", 5);
        testResturant.addReview(newTestReview);
        testResturant.addReview(newTestReviewtwo);
        double expectedAverage = 4.5;
        assertTrue("Can not calculate average stars of all reviews",  testResturant.calculateAverageReviewStars() == expectedAverage);
        assertEquals("Instance was not updated with stars", expectedAverage, testResturant.numberOfStars , .01);

    }
}
