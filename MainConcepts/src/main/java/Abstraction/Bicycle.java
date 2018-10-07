package Abstraction;

abstract class Bicycle {

    private int numofgears;

    Bicycle(){
        numofgears = 10;
    }

    void printBikeBrand(String name) {
        System.out.println("This bike is a " + name);
    }

    void setNumofgears(int numofgears) {
        this.numofgears = numofgears;
    }

    int getNumofgears() {
        return numofgears;
    }

    abstract void bikeModelName(String model);
}