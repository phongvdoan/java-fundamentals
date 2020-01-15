package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shops testShop;

    @Before
    public void setUP(){
        testShop = new Shops("Target", "A general store where you can find everything", 2);
    }
    @Test
    public void testShopConstructorAndToString() {
        assertEquals("toString method is not working", "Target is A general store where you can find everything \n" +
                " It is 2 expensive.", testShop.toString());
    }

    @Test
    public void testShopClass_addReviewMethod(){
        Review newTestReview = new Review("It was pretty good", "Mani", 4, testShop.storeName);
        Review newTestReviewtwo = new Review("It was good", "Jane", 5, testShop.storeName);

        testShop.addReview(newTestReview);
        testShop.addReview(newTestReviewtwo);
        assertEquals("new Reviews are not adding to LinkedList of reviews", "[Store: Target\n" +
                "Reviews:\n" +
                "Mani said 'It was pretty good\n" +
                "Mani rates Target, a 4 out of 5, Store: Target\n" +
                "Reviews:\n" +
                "Jane said 'It was good\n" +
                "Jane rates Target, a 5 out of 5]", testShop.allReviews.toString());
    }


}
