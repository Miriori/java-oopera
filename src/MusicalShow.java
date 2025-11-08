public class MusicalShow extends Show {
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
    // Геттеры для новых полей
    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    // Вывести либретто
    public void printLibretto() {
        System.out.println("Либретто спектакля \"" + getTitle() + "\":");
        System.out.println(librettoText);
        System.out.println();
    }
}