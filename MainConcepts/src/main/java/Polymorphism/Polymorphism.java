package Polymorphism;

public class Polymorphism {

    public Polymorphism() {
        System.out.println("\nPolymorphism:");

        Animal moose = new Moose(6, 4, "Moose");
        Animal centipede = new Centipede(6, 100, "Centipede");

        System.out.println(moose.getName());
        System.out.println(centipede.getName());
    }
}