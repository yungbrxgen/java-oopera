import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Лебедев", Gender.MALE, 184);
        Actor actor2 = new Actor("Василиса", "Синица", Gender.FEMALE, 174);
        Actor actor3 = new Actor("Борис", "Кравченко", Gender.MALE, 180);

        Director director1 = new Director("Андрей", "Горшков", Gender.MALE, 179, 25);
        Director director2 = new Director("Виталий", "Клюев", Gender.MALE, 166, 19);

        ArrayList<Actor> actorsShow1 = new ArrayList<>();
        actorsShow1.add(actor1);
        actorsShow1.add(actor3);

        Show show = new Show("Второе дыхание", 70, director1, actorsShow1);

        System.out.println("Список актеров представления:");
        show.printActors();

        ArrayList<Actor> actorsBallet = new ArrayList<>();
        actorsBallet.add(actor1);
        actorsBallet.add(actor2);
        Person musicAuthor1 = new Person("Владимир", "Пупкин", 185, Gender.MALE);
        Person choreographer1 = new Person("Наталья", "Пехота", 162, Gender.FEMALE);

        Ballet ballet = new Ballet("Щелкунчик",30, director2, actorsBallet, musicAuthor1,
                "На новогодний праздник в дом Штальбаумов собираются гости. Среди них и Дроссельмейер," +
                        " крестный отец Мари и Фрица — детей Штальбаумов. Он приготовил им чудесный подарок — забавного Щелкунчика.",
                choreographer1);

        System.out.println("Список актеров балета:");
        ballet.printActors();

        ArrayList<Actor> actorsOpera = new ArrayList<>();
        actorsOpera.add(actor2);
        actorsOpera.add(actor3);
        Person musicAuthor2 = new Person("Клавдия", "Мирошниченко", 155, Gender.FEMALE);

        Opera opera = new Opera("Аида", 45, director2, actorsOpera, musicAuthor2,
                "Радамес одерживает победу над эфиопами и со своим войском возвращается в Фивы, ведя за " +
                        "собой пленных. Аида с ужасом узнаёт среди них своего отца — эфиопского царя Амонасро, который" +
                        " скрывает своё настоящее положение.", 15);

        System.out.println("Список актеров оперы:");
        opera.printActors();

        show.changeActor(actor2, "Лебедев");

        opera.changeActor(actor3, "Петров");

        opera.printLibretto();
        ballet.printLibretto();

    }
}
