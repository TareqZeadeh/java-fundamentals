package inheritance;

public class Review {
    private String body;
    private String author;
    private int starsNum;



    public Review(String body, String author, int starsNum) {
        this.body = body;
        this.author = author;
        if (starsNum > 5) {
            this.starsNum = 5;
        } else if (starsNum <= 5 && starsNum >= 0) {
            this.starsNum = starsNum;
        } else {
            this.starsNum = 0;
        }

    }


//    @Override
//    public String toString() {
//        return String.format("%s Says"+" "+"%s"+" " +" and his rate is "+"%d\n\n", author, body, starsNum);
//    }


    @Override
    public String toString() {
        return "Review{" + "body='" + body + '\'' + ", author='" + author + '\'' + ", starsNum=" + starsNum + '}';
    }

    public int getStarsNum() {
        return starsNum;
    }
}
