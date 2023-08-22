class Gryffindor extends Hogwarts {
    private int nobility;//благородство
    private int honor;//честь
    private int courage;//храбрость

    public Gryffindor(int witchcraft, int transgression, int nobility, int honor, int courage) {
        super(witchcraft, transgression);
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


}
