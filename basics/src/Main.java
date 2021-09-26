import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(5);
        clock();

    }

    //------------pluralize method--------------------

    public static String pluralize (String word , int number){
        if((number == 0)||(number >1)){
            return word + "s";
        }else {
            return word;
        }
    }

    //---------------flipNHeads method------------------------
    public static void flipNHeads(int n){
        int flipCount = 0;
        int headCount = 0;
        double randomNum = 0.0;
        while (!(headCount == n)){
            randomNum = Math.random();
            if(randomNum >= 0.5){
                System.out.println("heads");
                headCount++;
                flipCount++;
            }
            else if (randomNum < 0.5) {
                System.out.println("tails");
                headCount =0;
                flipCount++;
            }

        }
        System.out.println("It took "+ flipCount + " flips to flip " + n + " head in a row.");
    }

    //------------------clock method------------------------------

    public static void clock(){

        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        String time = hour + ":" + minute + ":" + second;
        System.out.println(time);
        while (true){
            currentTime = LocalDateTime.now();
            if (second != currentTime.getSecond()){
                clock();
            }
    }





}
}
