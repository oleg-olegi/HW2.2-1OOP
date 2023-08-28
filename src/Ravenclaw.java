class Ravenclaw extends Hogwarts {
    private int smart;//ум
    private int wise;//мудрость
    private int witty;//остроумие
    private int creativity;//творчество

    public Ravenclaw(String fullName, int witchcraft, int transgression, int smart, int wise, int witty, int creativity) {
        super(fullName, witchcraft, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public static void studentComparison(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.getCreativity() + student1.getWitty() + student1.getWise() +
                student1.getSmart();
        int sum2 = student2.getCreativity() + student2.getWitty() + student2.getWise() +
                student2.getSmart();
        if (sum1 > sum2) {
            System.out.println("Студент " + student1.getFullName() +
                    " лучший Когтевранец, чем " + student2.getFullName());
        } else {
            System.out.println("Студент " + student2.getFullName() +
                    " лучший Когтевранец, чем " + student1.getFullName());
        }
    }

    @Override
    public void studentDescription() {
        System.out.println("Имя - " + getFullName() + ", witchcraft " + getWitchcraft() +
                ", transgression " + getTransgression() + ", smart " + getSmart() + ", wise " + getWise() +
                ", witty " + getWitty() + ", creativity " + getCreativity());
    }
}
