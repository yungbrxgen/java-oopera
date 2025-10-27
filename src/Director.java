public class Director extends Person {
    private final int numberOfShows;

    public Director(String name, String surname, Gender gender, int height, int numberOfShows ) {
        super(name, surname, height, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", gender=" + getGender() +
                ", height='" + getHeight() +
                ", numberOfShows=" + numberOfShows +
                '}';
    }
}