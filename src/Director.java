public class Director extends Person{
    private int numberOfShows;
    private GENDER gender;

    public Director(String name, String surname, int numberOfShows, GENDER gender) {
        super(name, surname);
        this.numberOfShows = numberOfShows;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Director{" +
                "Имя: " + getName() + ", " +
                "Фамилия: " + getSurname() + "} ";
    }
    // геттеры и сеттеры
    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }
}
