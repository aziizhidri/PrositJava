public class ZooManagement {
    public static void main(String[] args) {
        // taw nkhallou les animaux s7i7in direct b constructeur
        Animal lion = new Animal("felidae", "simba", 5, true);
        Animal tiger = new Animal("felidae", "shere khan", 7, true);

        // zoo b constructeur paramétré
        Zoo myZoo = new Zoo("wildlife park", "ariana", 25);

        // n7ott les animaux fil tableau
        myZoo.animals[0] = lion;
        myZoo.animals[1] = tiger;

        // affichage simple
        System.out.println("zoo: " + myZoo.name + " fi " + myZoo.city);
        System.out.println("1er animal: " + myZoo.animals[0].name);
        System.out.println("2ème animal: " + myZoo.animals[1].name);
    }
}
