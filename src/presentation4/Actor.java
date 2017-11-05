package presentation4;

public class Actor {

    private String name;
    private int age;
    private boolean wonOscar;

    Actor(String name, int age, boolean wonOscar) {
        this.name = name;
        this.age = age;
        this.wonOscar = wonOscar;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    boolean hasWonOscar() {
        return wonOscar;
    }
}
