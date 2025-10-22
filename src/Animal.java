public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // constructeur vide
    public Animal() {}

    // constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // toString: bch najem naffichi directement
    @Override
    public String toString() {
        return "animal{family='" + family + "', name='" + name + "', age=" + age + ", isMammal=" + isMammal + "}";
    }
}
