public class Hogwarts {
    private String fullName;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String fullName, int witchcraft, int transgression) {
        this.fullName = fullName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }


    public int getTransgression() {
        return transgression;
    }

    public void studentDescription() {//описание студента
        System.out.println("Имя - " + fullName + ", witchcraft " + getWitchcraft() +
                ", transgression " + getTransgression());
    }

    @Override
    public String toString() {
        return fullName + " witchcraft " + witchcraft + " transgression " + transgression;
    }
}
