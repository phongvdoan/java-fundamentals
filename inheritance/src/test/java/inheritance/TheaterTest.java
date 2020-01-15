package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    Theater testTheater;

    @Before
    public void setUP(){
        testTheater = new Theater("AMC");
    }

    @Test
    public void testTheaterConstructorAndToString() {
        assertEquals("toString method is not working", "AMC\n" +
                "Current Movies showing: ", testTheater.toString());
    }

    @Before
    public void setUpMovies(){
        testTheater.addMovie("Gone in Sixty Seconds");
        testTheater.addMovie("Titanic");
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
        Review newTestReview = new Review("It was pretty good", "Mani", 4, testTheater.name);
        Review newTestReviewtwo = new Review("It was good", "Jane", 5, testTheater.name);

        testTheater.addReview(newTestReview);
        testTheater.addReview(newTestReviewtwo);
        assertEquals("new Reviews are not adding to LinkedList of reviews", "[Review: AMC , It was pretty good\n" +
                " by Mani.\n" +
                " 4 star rating.\n" +
                ", Review: AMC , It was good\n" +
                " by Jane.\n" +
                " 5 star rating.\n" +
                "]", testTheater.allReviews.toString());
    }
}
