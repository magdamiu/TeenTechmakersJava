package presentation4;

public class Main {

    public static void main(String[] args) {

        Actor[] actors = new Actor[]{
                new Actor("Tom Cruise", 58, true),
                new Actor("Jack Nicholson", 65, false),
                new Actor("Robert De Niro", 41, false),
                new Actor("Al Pacino", 45, true),
                new Actor("Nicolas Cage", 59, false)
        };
        Rating[] ratings = new Rating[]{
                new Rating("This is an awesome movie", 5),
                new Rating("Bad movie", 1),
                new Rating("Super movie", 4),
                new Rating("The movie was ok", 3),
                new Rating("It was an awesome comedy movie", 5),
                new Rating("Boring movie", 2),
                new Rating("Super awesome movie", 5)
        };

        Movie theMovie = new Movie(actors, ratings);


        System.out.println("The avg age of actors is " + theMovie.getAvgAgeOfActors());
        System.out.println("The oldest actor is " + theMovie.getOldestActor());
        System.out.println("The avg number of stars is " + theMovie.getAvgNumberOfStars());
        System.out.println("The number of actors is " + theMovie.getNumberOfActors());
        System.out.println("Has an actor won oscar: " + theMovie.hasAnyWonOscar());
    }
}
