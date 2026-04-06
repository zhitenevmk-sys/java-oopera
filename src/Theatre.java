public class Theatre {

    public static void main(String[] args) {

        Actor actorFirst = new Actor("Александр", "Романов",175, Person.GENDER.MALE);
        Actor actorSecond = new Actor("Михаил", "Щегол", 140, Person.GENDER.MALE);
        Actor actorThird = new Actor("Елена", "Высокая", 192, Person.GENDER.FEMALE);

        Director directorFirst = new Director("Петр", "Петров",3, Person.GENDER.MALE);
        Director directorSecond = new Director("Сергей", "Плодотворнов",165, Person.GENDER.MALE);

        Ballet ballet = new Ballet(); // для определения хореографа и либретто
        ballet.setChoreographer(new Person("Алексей", "Кривоногов"));
        ballet.setLibrettoText("""
                Щелкунчик приказывает зайчикам снова бить тревогу.\s
                Крышки слетают с коробок, в которых лежат оловянные солдатики:\s
                здесь и гренадеры, и гусары, и артиллеристы с пушками.
                """);

        MusicalShow musicalShow = new MusicalShow(); // для определения автора музыки
        musicalShow.setMusicAuthor(new Person("Матвей", "Глухих"));

        Opera opera = new Opera(); // для определения либретто
        opera.setLibrettoText("""
                Фигаро и Сюзанна, слуги Графа и Графини Альмавива,\s
                готовятся к свадьбе. Фигаро узнает от своей невесты,\s
                что Граф надеется соблазнить ее, и приходит в ярость.\s
                Он полон решимости отомстить своему хозяину.
                """);

        Person MusicAuthor = musicalShow.getMusicAuthor();
        Person choreographer = ballet.getChoreographer();
        String librettoBallet = ballet.getLibrettoText();
        String librettoOpera = opera.getLibrettoText();

        Show show = new Show("Ромео и Джульетта", 150, directorFirst);
        Ballet balletShow = new Ballet("Щелкунчик", 160, directorSecond, MusicAuthor, librettoBallet, choreographer);
        Opera operaShow = new Opera("Свадьба Фигаро", 120, directorSecond, MusicAuthor, librettoOpera, 12);

        show.addActor(actorFirst); // добавление актеров
        show.addActor(actorThird);
        balletShow.addActor(actorSecond);
        operaShow.addActor(actorSecond);
        operaShow.addActor(actorThird);

        show.printListOfActors(); // вывод на экрас списка актеров
        balletShow.printListOfActors();
        operaShow.printListOfActors();

        show.replaceActor(actorFirst, actorSecond);// замена актеров
        show.printListOfActors();

        operaShow.replaceActor(actorFirst, actorSecond);// замена несуществующего актеров
        operaShow.printListOfActors();

        balletShow.printLibrettoText();// печать либретто
    }
}