package Person;

public class Director extends Person{
    private int numberOfShows;

    public Director(String name, String surname, int numberOfShows, GENDER gender) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
    // геттеры и сеттеры
    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }
}
