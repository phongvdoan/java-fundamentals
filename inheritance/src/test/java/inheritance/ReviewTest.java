package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testReviewConstructorAndToString() {
        Review testReview = new Review("Mickey D's", "Bob", 2, "example name");
        assertEquals("Review contructor or toString is not working","\n" +
                "Reviews:\n" +
                "Bob said 'Mickey D's\n" +
                "Bob rates example name, a 2 out of 5", testReview.toString());
    }


}
