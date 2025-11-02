public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    // Геттер для choirSize
    public int getChoirSize() {
        return choirSize;
    }

    @Override
    public String toString() {
        return "Опера \"" + super.getTitle() + "\", хор: " + choirSize + " человек";
    }
}
