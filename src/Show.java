import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration; // в минутах
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

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

    // Вывести список актёров
    public void printActorsList() {
        System.out.println("Список актёров спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
        System.out.println();
    }

    // Добавить актёра (с проверкой на дубликаты)
    public void addActor(Actor actor) {
        for (Actor existing : listOfActors) {
            if (existing.equals(actor)) {
                System.out.println("Актёр " + actor + " уже участвует в спектакле!");
                return;
            }
        }
        listOfActors.add(actor);
        System.out.println("Актёр " + actor + " добавлен в спектакль.");
    }

    // Заменить актёра по фамилии
    public void replaceActor(Actor newActor, String surnameToReplace) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Актёр с фамилией " + surnameToReplace + " не найден в спектакле!");
        } else {
            listOfActors.set(index, newActor);
            System.out.println("Актёр с фамилией " + surnameToReplace +
                    " заменён на " + newActor + ".");
        }
    }
    // Выводится список режиссера и спектакле
    public void printDirectorInfo() {
        System.out.println("Спектакль: \"" + title + "\", режиссёр: " + director.getName() + " " + director.getSurname());
    }
}