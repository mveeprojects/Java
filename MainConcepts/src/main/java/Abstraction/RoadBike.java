package Abstraction;

class RoadBike extends Bicycle {

    RoadBike() {
        System.out.println("Hi this class is called RoadBike");
    }

    void printBikeBrand() {
        System.out.println("I'm an extra implementation of the method");
    }

    void printBikeBrand(String name) {
        System.out.println("I'm overriding the default method \"printBikeBrand\" in the abstract class just by being here");
        System.out.println("This bike is a " + name);
    }

    @Override
    void bikeModelName(String model) {
        System.out.println("Model of bike: " + model);
    }
}