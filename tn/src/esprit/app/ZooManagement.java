package esprit.app;

import esprit.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        // Instruction 22/23: parameterized constructors (full)
        Aquatic aq = new Aquatic("Fish", "Nemo", 1, false, "Sea");
        Dolphin d = new Dolphin("Mammal", "Flipper", 3, true, "Ocean", 25.5f);
        Penguin p = new Penguin("Bird", "Skipper", 2, false, "Antarctica", 18.0f);

        // Show results (Instruction 23: toString)
        System.out.println(aq);
        System.out.println(d);
        System.out.println(p);

        // ✅ POLYMORPHISM DEMO
        System.out.println("--- polymorphism demo ---");
        Aquatic[] animals = { aq, d, p }; // All declared as Aquatic

        for (Aquatic a : animals) {
            a.swim();  // the same call produces different behavior
        }
    }
}
