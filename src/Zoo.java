public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;   // capacity for this zoo (kept, not constant yet)
    private int nbAnimaux;  // current count

    public Zoo() {
        this("Unnamed Zoo", "Unknown", 0);
    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = Math.max(0, nbrCages);
        this.animals = new Animal[this.nbrCages];
        this.nbAnimaux = 0;
    }

    // Getters
    public String getName() { return name; }
    public String getCity() { return city; }
    public int getNbrCages() { return nbrCages; }
    public int getNbAnimaux() { return nbAnimaux; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setCity(String city) { this.city = city; }

    // Instr. 10 + 12: add with capacity + unique
    public boolean ajouterAnimal(Animal a) {
        if (a == null) return false;
        if (isFull()) return false;
        if (indexOfByName(a.getName()) != -1) return false; // uniqueness by name
        animals[nbAnimaux++] = a;
        return true;
    }

    // Instr. 11: naffichi
    public void afficherAnimaux() {
        if (nbAnimaux == 0) {
            System.out.println("Zoo vide.");
            return;
        }
        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println((i + 1) + " - " + animals[i]);
        }
    }

    // Instr. 11:
    public int indexOfByName(String name) {
        if (name == null) return -1;
        for (int i = 0; i < nbAnimaux; i++) {
            if (animals[i].getName().equalsIgnoreCase(name)) return i;
        }
        return -1;
    }

    // Instr. 13: delete by name
    public boolean supprimerAnimal(String name) {
        int idx = indexOfByName(name);
        if (idx == -1) return false;
        for (int i = idx; i < nbAnimaux - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--nbAnimaux] = null;
        return true;
    }

    // Instr. 15 helpers
    public boolean isFull() { return nbAnimaux >= nbrCages; }
    public static Zoo comparer(Zoo z1, Zoo z2) {
        if (z1 == null) return z2;
        if (z2 == null) return z1;
        return (z1.nbAnimaux >= z2.nbAnimaux) ? z1 : z2;
    }

    // Info
    public void displayZoo() {
        System.out.println("ism el zoo: " + name);
        System.out.println("madina: " + city);
        System.out.println("nombre de cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + ", nbAnimaux=" + nbAnimaux + "}";
    }
}
