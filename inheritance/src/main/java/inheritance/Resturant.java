package inheritance;

import java.util.*;


public class Resturant extends Store {


    float categoryOfPrice;


    public Resturant (float categoryOfPrice, String name, double numberOfStars ) {
        super(name,numberOfStars);
        this.categoryOfPrice = categoryOfPrice;
    }



    public String toString(){
        StringJoiner buisnessInfo = new StringJoiner("\n\n");
        buisnessInfo.add(String.format("Resturant: %s\n %.1f stars.\n %s price category", this.storeName, this.numberOfStars, this.categoryOfPrice));
        for(Review review : this.allReviews) {
            buisnessInfo.add(String.format("Review: %s\n by %s.\n %s star rating.", review.body, review.author, review.stars));
        }


        return  buisnessInfo.toString();
    }


}
