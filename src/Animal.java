public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // constructeur vide (juste par défaut, ma y3ml chay)
    public Animal() {}

    // constructeur paramétré (bhay nkhallouha tkhalina n3abi les infos mra wa7da)
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
}
