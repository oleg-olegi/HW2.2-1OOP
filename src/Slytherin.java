class Slytherin extends Hogwarts {
    private int cunning;//хитрость
    private int determination;//решительность
    private int ambition;//амбициозность
    private int resourcefulness;//находчивость
    private int lustOfPower;//жажда власти

    public Slytherin(String fullName, int witchcraft, int transgression, int cunning,
                     int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(fullName, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public static void studentComparison(Slytherin student1, Slytherin student2) {
        int sum1 = student1.getAmbition() + student1.getResourcefulness() + student1.getLustOfPower()
                + student1.getDetermination() + student1.getCunning();
        int sum2 = student2.getAmbition() + student2.getResourcefulness() + student2.getLustOfPower()
                + student2.getDetermination() + student2.getCunning();
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
                ", transgression " + getTransgression() + ", cunning " + getCunning() + ", determination " + getDetermination()
                + ", ambition " + getAmbition() + ", resourcefulness " + getResourcefulness() +
                ", lustOfPower " + getLustOfPower());
    }
}