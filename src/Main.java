public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 85, 70,
                90, 94, 96);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 99, 99,
                99, 98, 97);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 50,
                37, 25, 68, 77);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 56, 45,
                77, 59, 65, 98);
        Ravenclaw padmaPatil = new Ravenclaw("Падма патил", 65, 5,
                56, 58, 92, 81);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 65, 5,
                56, 58, 92, 81);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 25, 85, 65,
                25, 58);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 56, 95, 79,
                73, 91);
        Hufflepuff justinFinchFletchleynew = new Hufflepuff("Джастин Финч-Флетчли", 69, 67,
                76, 88, 83);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 69, 86,
                99, 97, 100, 12, 100);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю", 2, 8,
                9, 9, 10, 12, 10);

        harryPotter.compareWith(dracoMalfoy);
    }
}
