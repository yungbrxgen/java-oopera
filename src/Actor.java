import java.util.Objects;

public class Actor extends Person {

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, height, gender);

    }

    @Override
    public String toString() {
        return "Actor{}" +
                "name='" + getName() + '\'' +
                ", surname=" + getSurname() + '\'' +
                ", gender=" + getGender() +
                ", height=" + getHeight() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return getHeight() == actor.getHeight() &&
                Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getHeight());
    }
}