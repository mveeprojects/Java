package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

    public Polymorphism() {
        System.out.println("\nPolymorphism:\n");

        Animal moose = new Moose(6, 4, "Moose");
        Animal centipede = new Centipede(6, 100, "Centipede");

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(moose);
        animals.add(centipede);
        printAnimals(animals);
    }

    private void printAnimals(List<Animal> animals) {
        System.out.println("Printing name of each polymorphic animal: ");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}