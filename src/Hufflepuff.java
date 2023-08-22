class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;//верность
    private int honest;//честность

    public Hufflepuff(String fullName, int witchcraft, int transgression, int hardworking, int loyal, int honest) {
        super(fullName, witchcraft, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public static void studentComparison(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.getHardworking() + student1.getHonest() + student1.getLoyal();
        int sum2 = student2.getHardworking() + student2.getHonest() + student2.getLoyal();
        if (sum1 > sum2) {
            System.out.println("Студент " + student1.getFullName() +
                    " лучший Пуффендуец, чем " + student2.getFullName());
        } else {
            System.out.println("Студент " + student2.getFullName() +
                    " лучший Пуффендуец, чем " + student1.getFullName());
        }
    }

    @Override
    public void studentDescription() {
        System.out.println("Имя - " + getFullName() + ", witchcraft " + getWitchcraft() +
                ", transgression " + getTransgression() + ", hardworking " + getHardworking() + ", loyal " +
                getLoyal() + ", honest " + getHonest());
    }
}
