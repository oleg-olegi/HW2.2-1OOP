public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Gryffindor("Гарри Поттер", 85, 70,
                        90, 94, 96),
                new Gryffindor("Гермиона Грейнджер", 99, 99,
                        99, 98, 97),
                new Gryffindor("Рон Уизли", 50, 37, 25, 68, 77),
                new Ravenclaw("Чжоу Чанг", 56, 45,
                        77, 59, 65, 98),
                new Ravenclaw("Падма патил", 65, 5,
                        56, 58, 92, 81),
                new Ravenclaw("Маркус Белби", 65, 5,
                        56, 58, 92, 81),
                new Hufflepuff("Захария Смит", 25, 85, 65,
                        25, 58),
                new Hufflepuff("Седрик Диггори", 56, 95, 79,
                        73, 91),
                new Hufflepuff("Джастин Финч-Флетчли", 69, 67,
                        76, 88, 83),
                new Slytherin("Драко Малфой", 69, 86,
                        99, 97, 100, 12, 100),
                new Slytherin("Грэхэм Монтегю", 2, 8,
                        9, 9, 10, 12, 10),
                new Slytherin("Грегори Гойл", 12, 18,
                        19, 19, 10, 12, 10)};

        students[0].studentDescription();
    }
}

