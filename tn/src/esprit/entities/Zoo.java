package esprit.entities;
public class Zoo {
    // constant nombre cages
    public static final int NBR_CAGES = 25;

    private Animal[] animals = new Animal[NBR_CAGES];
    private String name;
    private String city;
    private int nbAnimaux;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticCount = 0;


    // constructors
    public Zoo() {
        this("Unnamed Zoo", "Unknown");
    }

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbAnimaux = 0;
    }

    // getters/setters
    public String getName() { return name; }
    public String getCity() { return city; }
    public int getNbAnimaux() { return nbAnimaux; }
    public int getNbrCages() { return NBR_CAGES; }
    public void setName(String name) { this.name = name; }
    public void setCity(String city) { this.city = city; }

    // add animal
    public boolean ajouterAnimal(Animal a) {
        if (a == null) return false;
        if (isFull()) return false;
        if (indexOfByName(a.getName()) != -1) return false;
        animals[nbAnimaux++] = a;
        return true;
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount >= aquaticAnimals.length) {
            System.out.println("Cannot add more aquatic animals: capacity full (10).");
        } else {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println(aquatic.getName() + " added to aquatic zone of zoo " + this.name);
        }
    }
    // Instruction 27: make all swim
    public void makeAllAquaticsSwim() {
        System.out.println("\n--- All aquatic animals are swimming ---");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();  // polymorphic call
        }
    }


    public void afficherAnimaux() {
        if (nbAnimaux == 0) {
            System.out.println("Zoo vide.");
            return;
        }
        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println((i + 1) + " - " + animals[i]);
        }
    }

    public int indexOfByName(String name) {
        if (name == null) return -1;
        for (int i = 0; i < nbAnimaux; i++) {
            if (animals[i].getName().equalsIgnoreCase(name)) return i;
        }
        return -1;
    }

    public boolean supprimerAnimal(String name) {
        int idx = indexOfByName(name);
        if (idx == -1) return false;
        for (int i = idx; i < nbAnimaux - 1; i++) animals[i] = animals[i + 1];
        animals[--nbAnimaux] = null;
        return true;
    }

    //  Instruction 15
    public boolean isFull() { return nbAnimaux >= NBR_CAGES; }

    public static Zoo comparer(Zoo z1, Zoo z2) {
        if (z1 == null) return z2;
        if (z2 == null) return z1;
        return (z1.nbAnimaux >= z2.nbAnimaux) ? z1 : z2;
    }
    // Instruction 29: get max swimming depth among penguins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        boolean found = false;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                float depth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                if (!found || depth > maxDepth) {
                    maxDepth = depth;
                    found = true;
                }
            }
        }
        return found ? maxDepth : 0.0f; // return 0
    }
    // Instruction 30: count aquatic
    public void displayNumberOfAquaticsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphins++;
            else if (aquaticAnimals[i] instanceof Penguin) penguins++;
        }
        System.out.println("Dolphins: " + dolphins + " | Penguins: " + penguins);
    }
    // Instruction 30: count aquatics by type
    public void displayNumberOfAquaticsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphins++;
            else if (aquaticAnimals[i] instanceof Penguin) penguins++;
        }
        System.out.println("Dolphins: " + dolphins + " | Penguins: " + penguins);
    }


    public void displayZoo() {
        System.out.println("ism el zoo: " + name);
        System.out.println("madina: " + city);
        System.out.println("nombre de cages: " + NBR_CAGES);
    }

    @Override
    public String toString() {
        return "zoo{name='" + name + "', city='" + city + "', nbrCages=" + NBR_CAGES +
                ", nbAnimaux=" + nbAnimaux + "}";
    }
}
