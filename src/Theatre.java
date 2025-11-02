public class Theatre {
    public static void main(String[] args) {
        // Создаём актёров
        Actor actor1 = new Actor("Иван", "Иванов", "мужской", 1.80);
        Actor actor2 = new Actor("Мария", "Петрова", "женский", 1.65);
        Actor actor3 = new Actor("Алексей", "Сидоров", "мужской", 1.75);

        // Создаём режиссёров
        Director director1 = new Director("Пётр", "Васильев", "мужской", 5);
        Director director2 = new Director("Анна", "Михайлова", "женский", 3);

        // Создаём автора музыки и хореографа
        String musicAuthor = "Пётр Ильич Чайковский";
        String choreographer = "Юрий Григорович";

        // Создаём спектакли
        Show regularShow = new Show("Горе от ума", 180, director1);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director2, musicAuthor, "История о заколдованной принцессе-лебеди...", choreographer);
        Opera opera = new Opera("Евгений Онегин", 210, director1, musicAuthor, "Лирические сцены по роману Пушкина...", 40);

        // Распределяем актёров по спектаклям
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor3);

        // Выводим списки актёров для каждого спектакля
        regularShow.printActorsList();
        ballet.printActorsList();
        opera.printActorsList();

        // Заменяем актёра в балете
        Actor newActor = new Actor("Елена", "Кузнецова", "женский", 1.70);
        ballet.replaceActor(newActor, "Петрова");
        ballet.printActorsList();

        // Пытаемся заменить несуществующего актёра в опере
        opera.replaceActor(actor2, "Смирнова");

        // Выводим либретто для музыкального спектакля
        ballet.printLibretto();
        opera.printLibretto();
    }
}