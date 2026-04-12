package Show;

import Person.Person;
import Person.Director;

public class MusicalShow extends Show{
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow() {
    }

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Либретто для представления " + getTitle() + ":");
        System.out.println(librettoText);
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
}
