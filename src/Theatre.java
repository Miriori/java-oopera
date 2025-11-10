public class Theatre {
    public static void main(String[] args) {
        // Создаём актёров
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 1.80);
        Actor actor2 = new Actor("Мария", "Петрова", Gender.FEMALE, 1.65);
        Actor actor3 = new Actor("Алексей", "Сидоров", Gender.MALE, 1.70);

        // Создаём режиссёров
        Director director1 = new Director("Петр", "Васильев", Gender.MALE, 5);
        Director director2 = new Director("Анна", "Михайлова", Gender.FEMALE, 3);


        // Создаём автора музыки и хореографа
        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Юрий", "Григорович", Gender.MALE);

        // Создаём спектакли
        Show regularShow = new Show("Горе от ума", 180, director1);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director2, musicAuthor, "История о заколдованной принцессе‑лебеди...", choreographer);
        Opera opera = new Opera("Евгений Онегин", 160, director1, musicAuthor, "Лриические сцены по роману Пушкина...", 40);


        // Распределяем актёров по спектаклям
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);


        ballet.addActor(actor1);
        ballet.addActor(actor3);


        opera.addActor(actor2);
        opera.addActor(actor3);

        // Выводим списки актёров для каждого спектакля
        regularShow.printActorsList();
        ballet.printActorsList();
        opera.printActorsList();

        //Выводится информация о режиссере и спектакле
        regularShow.printDirectorInfo();
        ballet.printDirectorInfo();
        opera.printDirectorInfo();

        Actor newActor = new Actor("Елена", "Кузнецова", Gender.FEMALE, 1.70);
        ballet.replaceActor(newActor, "Петрова");
        ballet.printActorsList();

// Пытаемся заменить несуществующего актёра в опере
        opera.replaceActor(actor2, "Смирнова");

// Выводим либретто для музыкального спектакля
        ballet.printLibretto();
        opera.printLibretto();
    }
}