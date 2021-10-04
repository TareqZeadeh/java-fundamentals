package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater implements Reviewable {
    private String name;
    private List<String>  moviesList;
    private Map<String , Review> reviews;

    public Theater(String name) {
        this.name = name;
        moviesList = new ArrayList<>();
        reviews = new HashMap<>();
    }
    public void addMovie(String movie){
        moviesList.add(movie);
    }
    public void removeMovie(String movie){
        moviesList.remove(movie);
    }

    public String getName() {
        return name;
    }

    public List<String> getMoviesList() {
        return moviesList;
    }

    public Map<String, Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Theater{" + "name='" + name + '\'' + ", moviesList=" + moviesList + '}'+ "\"" + " Reviews : {" + reviews + "\n ";
    }



    public void addReview(String movieName,Review review){
        if(moviesList.contains(movieName)){
            reviews.put(movieName,review);
        }else {
            System.out.println("The movie is not in the list for now");
        }
    }

    @Override
    public void addReview(Review review) {
        reviews.put("No Movie Name",review);
    }
}
