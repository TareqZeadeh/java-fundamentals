package inheritance;
import java.lang.*;
import java.util.HashSet;
import java.util.Set;

public class Restaurant implements Reviewable{
    private String name;
    private String priceCategory;
    private int stars;
    private Set<Review> reviews;

    public Restaurant() {

    }

    public Restaurant(String name, String priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.stars = 0;
        this.reviews = new HashSet<>();
    }


@Override
    public void addReview(Review review){

        reviews.add(review);
        int starsSum = 0;
        for (Review rev : reviews) {
            starsSum = rev.getStarsNum() + starsSum;
        }
        stars =  starsSum /reviews.size();
    }
    public Set<Review> getReviews() {
        return reviews;
    }

    private String stringReviews(){
        StringBuilder restReviews = new StringBuilder();
        for (Review review : this.reviews){
                restReviews.append(review.toString());
        }
        return restReviews.toString();
    }

//    @Override
//    public String toString() {
//        String str = "";
//        str = str + "Restaurant :  " + name + ", It's prices :  " + priceCategory + "$, with rate :" + stars + " stars "+"\n\n";
//        str = str + stringReviews();
//        return str;
//    }

    @Override
    public String toString() {
        return "Restaurant{" + "name='" + name + '\'' + ", priceCategory='" + priceCategory + '\'' + ", stars=" + stars + '}' +  " Reviews : " + reviews +"\n";
    }


}
