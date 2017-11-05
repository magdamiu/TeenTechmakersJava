package presentation4;

public class Movie {

    private Actor[] actors;
    private Rating[] ratings;

    Movie(Actor[]  actors, Rating[] ratings) {
        this.actors = actors;
        this.ratings = ratings;
    }

    float getAvgAgeOfActors() {

        int i;
        int avg = 0;

        for (i = 0; i < actors.length; i++) {
            avg += actors[i].getAge();
        }

        return (float) avg / actors.length;
    }

    float getAvgNumberOfStars() {

        int z;
        float avg = 0;

        for (z = 0; z < ratings.length; z++) {
            avg = avg + ratings[z].getNumberOfStars();
        }
        return avg / ratings.length;
    }

    String getOldestActor() {

        Actor max = actors[0];
        int pos = 0;
        for( int i = 1; i < actors.length; i++) {
            if(max.getAge() < actors[i].getAge()) {
                max = actors[i];
                pos = i;
            }
        }

        return actors[pos].getName();
    }

    int getNumberOfActors() {
        return actors.length;
    }

    boolean hasAnyWonOscar() {

        boolean hasOscar = false;
        for (int i = 0;i < actors.length; i++) {
            if(actors[i].hasWonOscar()) {
                hasOscar = true;
                break;
            }
        }
        return hasOscar;
    }
}
