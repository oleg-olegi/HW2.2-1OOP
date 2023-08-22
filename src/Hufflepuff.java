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

    @Override
    public void studentDescription() {
        System.out.println("Имя - " + getFullName() + ", witchcraft " + getWitchcraft() +
                ", transgression " + getTransgression() + ", hardworking " + getHardworking() + ", loyal " +
                getLoyal() + ", honest " + getHonest());
    }
}
