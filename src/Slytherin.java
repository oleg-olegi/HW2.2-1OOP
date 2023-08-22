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

    @Override
    public void studentDescription() {
        System.out.println("Имя - " + getFullName() + ", witchcraft " + getWitchcraft() +
                ", transgression " + getTransgression() + ", cunning " + getCunning() + ", determination " + getDetermination()
                + ", ambition " + getAmbition() + ", resourcefulness " + getResourcefulness() +
                ", lustOfPower " + getLustOfPower());
    }
}