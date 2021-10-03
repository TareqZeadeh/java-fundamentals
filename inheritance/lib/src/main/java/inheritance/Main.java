package inheritance;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("McDonald's", "20");
        Review review1 = new Review("tasty","tariq",5);
        Review review2 = new Review("good","mohammed",3);
        Review review3 = new Review("bad","hatem",1);
        Review review4 = new Review("very good","zaid",4);
        Review review5 = new Review("not bad","tariq",2);

        restaurant.addReview(review1);
        restaurant.addReview(review2);
        restaurant.addReview(review3);
        restaurant.addReview(review4);
        restaurant.addReview(review5);

        System.out.println(restaurant);
    }
}
