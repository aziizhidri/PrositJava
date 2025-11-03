package esprit.entities;

public class Aquatic extends Animal {
    // Instruction 20
    protected String habitat;

    // Instr. 21 (default) & 22 (param for its OWN attrs)
    public Aquatic() { }
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public Aquatic(String habitat) {
        super();           // use Animal()
        this.habitat = habitat;
    }

    // Getter to avoid future "cannot find symbol getHabitat" errors
    public String getHabitat() { return habitat; }

    // Instr. 23
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'}";
    }

    // Instr. 24
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
