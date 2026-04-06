import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public Show() {
    }

    public void printListOfActors() { // печать списка актеров
        System.out.println("Список актеров для представления " + title);

        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }

        System.out.println();
    }

    public void addActor(Actor newActor) { // добать актера
        int i = 0;

        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Этот актер уже в группе!");
                i += 1;
            }
        }

        if (i == 0) {
            listOfActors.add(newActor);
        }
    }

    public void replaceActor(Actor ReplacedActor, Actor newActor) { // заменить актера
        if (listOfActors.contains(ReplacedActor)) {
            int index = listOfActors.indexOf(ReplacedActor);
            listOfActors.set(index, newActor);
        } else {
            System.out.println("Заменяемого актера не существует.");
        }
    }

    public void printDirector() { // печать информации о режиссёре
        System.out.println("Информация о режиссёре спектакля \n" + director);
        System.out.println();
    }

    @Override
    public String toString() {
        String result = "";

        for (Actor actor : listOfActors) {
            result += actor.toString() + "\n";
        }

        return result;
    }
    // геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
}
