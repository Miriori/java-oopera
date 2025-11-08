public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
    // Геттер для choreographer
    public Person getChoreographer() {
        return choreographer;
    }

    @Override
    public String toString() {
        return "Балет \"" + super.getTitle() + "\", хореограф: " + choreographer;
    }
}