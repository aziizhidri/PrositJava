public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    // constructeur vide (normal, fi awal)
    public Zoo() {}

    // constructeur paramétré (bhay nkhallou el creation tbid moins code)
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
}
