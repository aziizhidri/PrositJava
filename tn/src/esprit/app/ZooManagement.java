package esprit.app;

import esprit.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        // creation zoo
        Zoo zoo1 = new Zoo("Esprit Zoo", "Tunis");
        Zoo zoo2 = new Zoo("Safari Park", "Sousse"); // kept for future use


        Dolphin d1 = new Dolphin("Mammal", "Flipper", 3, true, "Ocean", 25.5f);
        Dolphin d2 = new Dolphin("Mammal", "Echo",    5, true, "Sea",   30.0f);
        Penguin p1 = new Penguin("Bird",   "Skipper", 2, false, "Antarctica", 18.0f);

        // add these mfs to (zoo1)
        zoo1.addAquaticAnimal(d1);
        zoo1.addAquaticAnimal(d2);
        zoo1.addAquaticAnimal(p1);

        System.out.println("\nAquatics added to " + zoo1.getName() + ".");
        // Instruction 27
        System.out.println();
        zoo1.makeAllAquaticsSwim();
        // Ins 29
        System.out.println("\nMax penguin swimming depth = " + zoo1.maxPenguinSwimmingDepth() + " meters");


        // --- older tests ---
        //
        // // default constructors (null/0 demo)
        // Aquatic aq0 = new Dolphin();
        // Terrestrial t0 = new Terrestrial();
        // System.out.println(aq0);
        // System.out.println(t0);
        //
        // // quick polymorphism check
        // Aquatic[] list = {
        //     new Dolphin("Ocean", 25.5f),
        //     new Penguin("Antarctica", 18.0f)
        // };
        // for (Aquatic a : list) a.swim();
    }
}
