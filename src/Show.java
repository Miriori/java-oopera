import java.util.ArrayList;
import java.util.List;

class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    // Геттер для поля title (необходим для наследников)
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActorsList() {
        return listOfActors;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле!");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен в спектакль.");
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameToReplace)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Актёр с фамилией " + surnameToReplace + " не найден в спектакле!");
        } else {
            listOfActors.set(index, newActor);
            System.out.println("Актёр с фамилией " + surnameToReplace + " заменён на " + newActor + ".");
        }
    }

    public void printActorsList() {
        System.out.println("Список актёров спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
        System.out.println();
    }
    public void printDirectorInfo() {
        System.out.println("Спектакль: \"" + title + "\", режиссёр: " + director.getName() + " " + director.getSurname());
    }
}