package inheritance;

import java.util.LinkedList;

public class Shops extends Store {
    String description;
    int numberofDollarSigns;


    public Shops(String name, String description, int numberofDollarSigns) {
        super(name, 3);
        this.description = description;
        this.numberofDollarSigns = numberofDollarSigns;

    }

    public String toString(){
        return String.format("%s is %s \n It is %d expensive.", this.storeName, this.description, this.numberofDollarSigns);
    }


}
