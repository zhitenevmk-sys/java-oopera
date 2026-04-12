package Show;

import Person.Actor;
import Person.Director;

import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    Scanner scanner = new Scanner(System.in); // добавил для реализации замены актеров с учетом однофамильцев

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

    public void addActor(Actor newActor) { // добавить актера
        if (listOfActors.contains(newActor)) {
            System.out.println("Этот актер уже в группе!");
            return;
        }
        listOfActors.add(newActor);
    }

    public void replaceActor(Actor newActor, String surname) { // заменить актера
        ArrayList<Actor> actorsCheck = new ArrayList<>(); // добавление найденных на замену актеров

        // поиск заменяемых актеров
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                actorsCheck.add(listOfActors.get(i));
            }
        }

        if (actorsCheck.isEmpty()) { // заменяемый актер не найдет
            System.out.println("Заменяемого актера не существует.");
        } else if (actorsCheck.size() == 1) { // однофамильцев нет, заменяемый актер найден
            int index = listOfActors.indexOf(actorsCheck.getFirst());
            listOfActors.set(index, newActor);
        } else if (actorsCheck.size() > 1) { // однофамильцы есть, реализация выбора - кого из них заменяем
            System.out.println("Актеров с такой фамилией несколько:");

            for (int i = 0; i < actorsCheck.size(); i++) {
                System.out.println((i + 1) + ". " + actorsCheck.get(i));
            }

            System.out.println("Введите номер актера для замены:");
            int scan = scanner.nextInt();

            if (scan > 0 && scan <= actorsCheck.size()) {
                int index = listOfActors.indexOf(actorsCheck.get(scan - 1));
                listOfActors.set(index, newActor);
            } else {
                System.out.println("Актера с таким номером нет");
            }
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
