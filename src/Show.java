import java.util.ArrayList;

public class Show {


    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }

    public void printDirectorInfo() {
        if (director != null) {
            System.out.println("Информация о режиссере:");
            System.out.println(director.toString());
        } else {
            System.out.println("Режиссер не указан.");
        }
    }

    public void printActors() {
        System.out.println("Актеры, участвующие в спектакле \"" + title + "\";");
        if (listOfActors != null && !listOfActors.isEmpty()) {
            for (Actor actor : listOfActors) {
                System.out.println(actor.toString());
            }
        } else {
            System.out.println("Список актеров пуст.");
        }
    }

    public void addActor(Actor actor) {
        if (actor != null && !listOfActors.contains(actor)) {
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor oldActor, Actor newActor) {
        if (oldActor == null || newActor == null) {
            System.out.println("Замена не удалась: Один из актеров (старый или новый) равен null.");
        } else if (listOfActors.contains(newActor)) {
            System.out.println("Замена не удалась: новый актер уже есть в списке.");
        }

        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).equals(oldActor)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Замена не удалась: Актер " + oldActor + " не найден в списке.");
        } else {
            listOfActors.remove(index);
            listOfActors.add(index, newActor);
            System.out.println("Актер успешно заменен.");
            System.out.println("Теперь " + newActor +
                    "играет вместо " + oldActor + ".");
        }
    }
}
