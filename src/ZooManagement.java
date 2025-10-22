public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("wildlife park", "ariana", 25);

        Animal lion   = new Animal("felidae", "simba", 5, true);
        Animal tiger  = new Animal("felidae", "shere khan", 7, true);

        myZoo.animals[0] = lion;
        myZoo.animals[1] = tiger;

        // affichage mta3 el zoo b el méthode
        myZoo.displayZoo();

        
        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(tiger);
    }
}
