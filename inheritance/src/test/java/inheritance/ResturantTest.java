package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ResturantTest {
    Resturant testResturant;
    @Before
    public void setUp(){
        testResturant = new Resturant(2 , "Mickey D's", 3);
    }

    @Test
    public void testResaurantConstructorAndToString() {

        assertEquals("The constructor and toString method broke.", "Resturant: Mickey D's\n" +
                " 3.0 stars.\n" +
                " 2.0 price category", testResturant.toString());
    }

    @Test
    public void testResaurant_AddReviewAndOutputOfToString() {
        Review newTestReview = new Review("It was pretty good", "Mani", 4, testResturant.storeName);
        Review newTestReviewtwo = new Review("It was good", "Jane", 5, testResturant.storeName);
        testResturant.addReview(newTestReview);
        testResturant.addReview(newTestReviewtwo);
        assertEquals("new Reviews are not adding to LinkedList of reviews", "Resturant: Mickey D's\n" +
                " 4.5 stars.\n" +
                " 2.0 price category\n" +
                "\n" +
                "Review: It was pretty good\n" +
                " by Mani.\n" +
                " 4 star rating.\n" +
                "\n" +
                "Review: It was good\n" +
                " by Jane.\n" +
                " 5 star rating.", testResturant.toString());
    }

    @Test
    public void testResaurant_AddReviewsAndGetAverage() {
        Review newTestReview = new Review("It was pretty good", "Mani", 4, testResturant.storeName);
        Review newTestReviewtwo = new Review("It was good", "Jane", 5, testResturant.storeName);
        testResturant.addReview(newTestReview);
        testResturant.addReview(newTestReviewtwo);
        double expectedAverage = 4.5;
        assertTrue("Can not calculate average stars of all reviews",  testResturant.calculateAverageReviewStars() == expectedAverage);
        assertEquals("Instance was not updated with stars", expectedAverage, testResturant.numberOfStars , .01);

    }
}
