public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    public Zoo() {}

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // fonction taffichi el infos ta3 el zoo
    void displayZoo() {
        System.out.println("ism el zoo: " + name);
        System.out.println("madina: " + city);
        System.out.println("nombre de cages: " + nbrCages);
    }


    @Override
    public String toString() {
        return "zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}";
    }
}
