import java.util.Objects;

public class Actor extends Person{
    private double height;
    private GENDER gender;

    public Actor(String name, String surname, double height, GENDER gender) {
        super(name, surname);
        this.height = height;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height && Objects.equals(getName(), actor.getName()) && Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

    @Override
    public String toString() {
        return "listOfActors{" +
                "Имя: " + getName() + ", " +
                "Фамилия: " + getSurname() + ", " +
                "(Рост: " + height + " см)}";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }
}

