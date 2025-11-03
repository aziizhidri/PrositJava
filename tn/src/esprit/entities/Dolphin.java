package esprit.entities;

public class Dolphin extends Aquatic {
    // Instruction 20
    protected float swimmingSpeed;

    public Dolphin() { }
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed + "}";
    }

   // Override to redifiine
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}
