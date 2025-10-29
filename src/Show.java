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

    public void changeActor(Actor newActor, String oldActorSurname) {
        if (newActor == null) {
            System.out.println("Замена не удалась: Новый актер актер равен null.");
            return;
        }
            if (oldActorSurname == null || oldActorSurname.isEmpty()) {
                System.out.println("Замена не удалась: Фамилия старого актера не указана.");
                return;
            }

            if (listOfActors.contains(newActor)) {
                System.out.println("Замена не удалась: Новый актер " + newActor.getSurname() +
                        " уже есть в списке.");
                return;
            }

            int index = -1;
            Actor actorToChange = null;
            for (int i = 0; i < listOfActors.size(); i++) {
                Actor currentActor = listOfActors.get(i);
                if (currentActor.getSurname().equals(oldActorSurname)) {
                    index = i;
                    actorToChange = currentActor;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Замена не удалась: Актер c фамилией " + oldActorSurname + " не найден в списке.");
                return;
            }
                listOfActors.remove(index);
                listOfActors.add(index, newActor);
                System.out.println("Актер успешно заменен.");
                System.out.println("Теперь " + newActor.getName() + " " + newActor.getSurname() +
                        " играет вместо " + actorToChange.getName() + " " + actorToChange.getSurname() + ".");
    }
}
