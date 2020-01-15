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
        buisnessInfo.add(String.format(" %s\n Average Rating: %.1f stars.\n Current Price Category %s", this.storeName, this.numberOfStars, this.categoryOfPrice));
        buisnessInfo.add(this.allReviews.toString());
        return  buisnessInfo.toString();
    }


}
