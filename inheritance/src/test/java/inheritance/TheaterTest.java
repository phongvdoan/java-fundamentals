package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    Theater testTheater;

    @Before
    public void setUP(){
        testTheater = new Theater("AMC");
        testTheater.addMovie("Gone in Sixty Seconds");
        testTheater.addMovie("Titanic");
    }


    @Test
    public void testTheaterConstructorAndToString() {
        assertEquals("toString method is not working", "AMC\n" +
                "Current Movies showing: \n" +
                "Gone in Sixty Seconds\n" +
                "Titanic", testTheater.toString());
    }


    @Test
    public void testAddMovie_addOne(){
        testTheater.addMovie("Batman");
        assertEquals("toString method is not working", "AMC\n" +
                "Current Movies showing: \n" +
                "Gone in Sixty Seconds\n" +
                "Titanic\n" +
                "Batman", testTheater.toString());
        testTheater.addMovie("Avengers");
        assertEquals("toString method is not working", "AMC\n" +
                "Current Movies showing: \n" +
                "Gone in Sixty Seconds\n" +
                "Titanic\n" +
                "Batman\n" +
                "Avengers", testTheater.toString());
    }

    @Test
    public void testRemoveMovie_removeOne(){
        assertEquals("toString method is not working", "AMC\n" +
                "Current Movies showing: \n" +
                "Gone in Sixty Seconds\n" +
                "Titanic", testTheater.toString());
        testTheater.removeMovie("Titanic");
        assertEquals("toString method is not working", "AMC\n" +
                "Current Movies showing: \n" +
                "Gone in Sixty Seconds", testTheater.toString());
    }

    @Test
    public void testTheaterClass_addReviewMethod(){
        Review newTestReview = new Review("It was pretty good", "Mani", 4, testTheater.storeName, "Batman");
        Review newTestReviewtwo = new Review("It was good", "Jane", 5, testTheater.storeName, "Titanic");

        testTheater.addReview(newTestReview);
        testTheater.addReview(newTestReviewtwo);
        assertEquals("new Reviews are not adding to LinkedList of reviews", "[Store: AMC\n" +
                "Reviews:\n" +
                "Mani said 'It was pretty good\n" +
                "Mani rates Batman, a 4 out of 5, Store: AMC\n" +
                "Reviews:\n" +
                "Jane said 'It was good\n" +
                "Jane rates Titanic, a 5 out of 5]", testTheater.allReviews.toString());
    }
}
