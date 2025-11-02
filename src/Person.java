import java.util.*;
// класс для людей
class Person {
    protected String name;
    protected String surname;
    protected String gender;

    public Person(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
