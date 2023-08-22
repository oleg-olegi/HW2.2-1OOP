public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 85, 70,
                90, 94, 96);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 99, 99,
                99, 98, 97);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 56, 45,
                77, 59, 65, 80);
        Gryffindor.studentComparison(harryPotter, hermioneGranger);
    }
}
