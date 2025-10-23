public class ZooManagement {
    public static void main(String[] args) {
       
        Zoo z1 = new Zoo("Esprit Zoo", "Ariana", 3);
        Zoo z2 = new Zoo("City Zoo", "Tunis", 5);

        Animal a1 = new Animal("Felidae", "Simba", 5, true);
        Animal a2 = new Animal("Felidae", "Nala", 4, true);
        Animal a3 = new Animal("Psittacidae", "Kiki", 2, false);
        Animal a4 = new Animal("Cercopithecidae", "Momo", 1, true);

        System.out.println("Add Simba: " + z1.ajouterAnimal(a1));
        System.out.println("Add Nala : " + z1.ajouterAnimal(a2));
        System.out.println("Add Kiki : " + z1.ajouterAnimal(a3));
        System.out.println("Add Momo : " + z1.ajouterAnimal(a4)); // should be false (full)

        System.out.println("\n== Liste des animaux ==");
        z1.afficherAnimaux();

        System.out.println("\nIndex 'Nala'     : " + z1.indexOfByName("Nala"));
        System.out.println("Index 'Inconnue' : " + z1.indexOfByName("Inconnue"));

        System.out.println("\n== Test unicité ==");
        Animal a1bis = new Animal("Felidae", "Simba", 6, true);
        System.out.println("Add Simba (duplicate): " + z1.ajouterAnimal(a1bis)); // expect false

        System.out.println("\n== Suppression 'Kiki' ==");
        System.out.println("Delete 'Kiki': " + z1.supprimerAnimal("Kiki"));
        z1.afficherAnimaux();

        z2.ajouterAnimal(new Animal("Canidae", "Bella", 3, true));
        z2.ajouterAnimal(new Animal("Canidae", "Rocky", 4, true));
        Zoo bigger = Zoo.comparer(z1, z2);
        System.out.println("\nZoo with more animals: " + bigger.getName()
                + " (" + bigger.getNbAnimaux() + " animaux)");

        System.out.println("\nInfos Z1:");
        z1.displayZoo();
        System.out.println(z1);
    }
}
