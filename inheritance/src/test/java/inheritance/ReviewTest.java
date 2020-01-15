package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testReviewConstructorAndToString() {
        Review testReview = new Review("Mickey D's", "Bob", 2, "example name");
        assertEquals("Review contructor or toString is not working","Review: Mickey D's\n" +
                " by Bob.\n" +
                " 2 star rating.", testReview.toString());
    }


}
