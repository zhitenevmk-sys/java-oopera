public class Ballet extends MusicalShow{
    private Person choreographer;

    public Ballet() {
    }

    public Ballet(String title, int duration, Director director, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }
}
