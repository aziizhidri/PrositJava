public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean mammal;

    public Animal() {}

    public Animal(String family, String name, int age, boolean mammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.mammal = mammal;
    }

    // Getters
    public String getFamily() { return family; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isMammal() { return mammal; }

    // Setters
    public void setFamily(String family) { this.family = family; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setMammal(boolean mammal) { this.mammal = mammal; }

    @Override
    public String toString() {
        return "animal{family='" + family + "', name='" + name + "', age=" + age + ", isMammal=" + mammal + "}";
    }
}
