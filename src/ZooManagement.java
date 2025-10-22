public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.family = "Felidae";
        lion.name = "Simba";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Wildlife Park";
        myZoo.city = "Ariana";
        myZoo.nbrCages = 25;

        myZoo.animals[0] = lion;

        System.out.println("Zoo: " + myZoo.name + " (" + myZoo.city + "), cages=" + myZoo.nbrCages);
        System.out.println("First animal: " + myZoo.animals[0].name);
    }
}
