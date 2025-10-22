public class ZooManagement {
    public static void main(String[] args) {
        // nzidou zoo wa7ed
        Zoo myZoo = new Zoo("wildlife park", "ariana", 25);

        // ncréiw b constructeur mra wa7da
        Animal lion   = new Animal("felidae", "simba", 5, true);
        Animal tiger  = new Animal("felidae", "shere khan", 7, true);
        Animal zebra  = new Animal("equidae", "marty", 4, true);
        Animal eagle  = new Animal("accipitridae", "aquila", 3, false);
        Animal monkey = new Animal("cercopithecidae", "george", 2, true);

        // n7ottouhom fil tableau (positions sahlîn)
        myZoo.animals[0] = lion;
        myZoo.animals[1] = tiger;
        myZoo.animals[2] = zebra;
        myZoo.animals[3] = eagle;
        myZoo.animals[4] = monkey;

        // affichage sgher bach nt2akked
        System.out.println("zoo: " + myZoo.name + " fi " + myZoo.city + " (cages: " + myZoo.nbrCages + ")");
        System.out.println("animals:");
        System.out.println(" - " + myZoo.animals[0].name);
        System.out.println(" - " + myZoo.animals[1].name);
        System.out.println(" - " + myZoo.animals[2].name);
        System.out.println(" - " + myZoo.animals[3].name);
        System.out.println(" - " + myZoo.animals[4].name);
    }
}
