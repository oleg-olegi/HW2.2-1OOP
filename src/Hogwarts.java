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

    private int compareWitchCraft(Hogwarts student) {
        return witchcraft - student.getWitchcraft();
    }

    private int compareTransgression(Hogwarts student) {
        return transgression - student.getTransgression();
    }

    public void compareWith(Hogwarts student) {
        int witchCraftComparison = compareWitchCraft(student);
        int transgressionComparison = compareTransgression(student);
        if (witchCraftComparison > 0) {
            System.out.println(getFullName() + " обладает большей мощностью магии, чем " + student.getFullName());
        } else {
            System.out.println(student.getFullName() + " обладает большей мощностью магии, чем " + getFullName());
        }
        if (transgressionComparison > 0) {
            System.out.println(getFullName() + " обладает большей дальностью трансгрессии, чем " + student.getFullName());
        } else {
            System.out.println(student.getFullName() + " обладает большей дальностью трансгрессии, чем " + getFullName());
        }
        if (witchCraftComparison == 0) {
            System.out.println(getFullName() + " сопоставим по силе магии с " + student.getFullName());
        } else if (transgressionComparison == 0) {
            System.out.println(getFullName() + " сопоставим по силе трансресии c " + student.getFullName());

        }
    }

    @Override
    public String toString() {
        return fullName + " witchcraft " + witchcraft + " transgression " + transgression;
    }
}

