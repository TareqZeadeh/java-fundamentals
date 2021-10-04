package inheritance;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Shop implements Reviewable{
    private String name;
    private String description;
    private String price;
    Set<Review> reviews;

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        reviews = new HashSet<>();

    }




    @Override
    public String toString() {
        return "Shop{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", price='" + price + '\'' + '}'+ "\"" +" Reviews : " + reviews +"\n" ;
    }


    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }

    public Set<Review> getReviews() {
        return reviews;
    }
}
