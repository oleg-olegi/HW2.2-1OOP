class Gryffindor extends Hogwarts {
    private int nobility;//благородство
    private int honor;//честь
    private int courage;//храбрость

    public Gryffindor(String fullName, int witchcraft, int transgression, int nobility, int honor, int courage) {
        super(fullName, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public static void studentComparison(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.getCourage() + student1.getNobility() + student1.getHonor();
        int sum2 = student2.getCourage() + student2.getNobility() + student2.getHonor();
        if (sum1 > sum2) {
            System.out.println("Студент " + student1.getFullName() +
                    " лучший Гриффидорец, чем " + student2.getFullName());
        } else {
            System.out.println("Студент " + student2.getFullName() +
                    " лучший Гриффидорец, чем " + student1.getFullName());
        }
    }

    @Override
    public void studentDescription() {
        System.out.println("Имя - " + getFullName() + ", witchcraft " + getWitchcraft() +
                ", transgression " + getTransgression() + ", nobility " + getNobility() + ", honor "
                + getHonor() + ", courage " + getCourage());
    }
}
