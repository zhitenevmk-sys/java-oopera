package Person;

public class Person {
    protected String name;
    protected String surname;
    protected GENDER gender;

    public Person(String name, String surname, GENDER gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public enum GENDER {
        MALE,
        FEMALE
    }
}

