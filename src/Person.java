import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private int height;
    private Gender gender;

    public Person(String name, String surname, int height, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return height == person.height &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height, gender);
    }
}

