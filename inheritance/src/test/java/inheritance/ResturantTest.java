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

        assertEquals("The constructor and toString method broke.", " Mickey D's\n" +
                " Average Rating: 3.0 stars.\n" +
                " Current Price Category 2.0\n" +
                "\n" +
                "[]", testResturant.toString());
    }

    @Test
    public void testResaurant_AddReviewAndOutputOfToString() {
        Review newTestReview = new Review("It was pretty good", "Mani", 4, testResturant.storeName);
        Review newTestReviewtwo = new Review("It was good", "Jane", 5, testResturant.storeName);
        testResturant.addReview(newTestReview);
        testResturant.addReview(newTestReviewtwo);
        assertEquals("new Reviews are not adding to LinkedList of reviews", " Mickey D's\n" +
                " Average Rating: 4.5 stars.\n" +
                " Current Price Category 2.0\n" +
                "\n" +
                "[\n" +
                "Reviews:\n" +
                "Mani said 'It was pretty good\n" +
                "Mani rates Mickey D's, a 4 out of 5, \n" +
                "Reviews:\n" +
                "Jane said 'It was good\n" +
                "Jane rates Mickey D's, a 5 out of 5]", testResturant.toString());
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
