package esprit.entities;

public abstract class Aquatic extends Animal {  // 28
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
    public abstract void swim();

    // Instru. 31

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic other = (Aquatic) obj;

        return  this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }

}

