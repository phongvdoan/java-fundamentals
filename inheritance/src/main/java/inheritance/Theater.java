package inheritance;

import java.util.LinkedList;
import java.util.StringJoiner;

public class Theater extends Store {
    LinkedList<String> currentMovies = new LinkedList<>();

    public Theater(String name) {
        super(name, 3);
    }

    public void addMovie(String movie){
        this.currentMovies.add(movie);
    }

    public void removeMovie(String movie){
        this.currentMovies.remove(movie);
    }

    public String toString(){
        StringJoiner string = new StringJoiner("\n");
        string.add(this.storeName);
        string.add("Current Movies showing: ");
        for(String movies : currentMovies){
            string.add(movies);
        }
        return string.toString();
    }

}
