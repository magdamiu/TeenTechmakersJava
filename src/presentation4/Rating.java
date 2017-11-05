package presentation4;

public class Rating {

    private String text;
    private int stars;

    Rating(String text, int stars) {
        this.text = text;
        this.stars = stars;
    }

    int getNumberOfStars() {
        return stars;
    }

    private String getRatingText() {
        return text;
    }
}
