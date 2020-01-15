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
        Review newTestReview = new Review("It was pretty good", "Mani", 4, testShop.name);
        Review newTestReviewtwo = new Review("It was good", "Jane", 5, testShop.name);

        testShop.addReview(newTestReview);
        testShop.addReview(newTestReviewtwo);
        assertEquals("new Reviews are not adding to LinkedList of reviews", "[Review: Target , It was pretty good\n" +
                " by Mani.\n" +
                " 4 star rating.\n" +
                ", Review: Target , It was good\n" +
                " by Jane.\n" +
                " 5 star rating.\n" +
                "]", testShop.allReviews.toString());
    }


}
