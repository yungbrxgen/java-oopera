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
}