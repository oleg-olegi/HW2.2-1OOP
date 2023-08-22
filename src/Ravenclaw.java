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

    @Override
    public void studentDescription() {
        System.out.println("Имя - " + getFullName() + ", witchcraft " + getWitchcraft() +
                ", transgression " + getTransgression() + ", smart " + getSmart() + ", wise " + getWise() +
                ", witty " + getWitty() + ", creativity " + getCreativity());
    }
}
