public class ZooManagement {
    public static void main(String[] args) {
        Zoo z1 = new Zoo("Esprit Zoo", "Ariana");
        Zoo z2 = new Zoo("City Zoo", "Tunis");

        Animal a1 = new Animal("Felidae", "Simba", 5, true);
        Animal a2 = new Animal("Felidae", "Nala", 4, true);
        Animal a3 = new Animal("Psittacidae", "Kiki", 2, false);

        System.out.println("Add Simba: " + z1.ajouterAnimal(a1));
        System.out.println("Add Nala : " + z1.ajouterAnimal(a2));
        System.out.println("Add Kiki : " + z1.ajouterAnimal(a3));

        System.out.println("\n== Liste des animaux ==");
        z1.afficherAnimaux();

        System.out.println("\n== Suppression de 'Kiki' ==");
        System.out.println("Supprimer 'Kiki': " + z1.supprimerAnimal("Kiki"));
        z1.afficherAnimaux();

        // capacity test
        System.out.println("\nZoo plein ? " + z1.isFull());

        // comparison
        z2.ajouterAnimal(new Animal("Canidae", "Rocky", 4, true));
        Zoo bigger = Zoo.comparer(z1, z2);
        System.out.println("\nZoo avec le plus d’animaux : " + bigger.getName());

        // infos
        System.out.println("\nInfos:");
        z1.displayZoo();
        System.out.println(z1);
    }
}
