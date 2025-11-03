package esprit.entities;

public class Terrestrial extends Animal {
    // Instruction 20
    protected int nbrLegs;

    public Terrestrial() { }
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial(int nbrLegs) {
        super();           // use Animal()
        this.nbrLegs = nbrLegs;
    }

    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs + "}";
    }
}
