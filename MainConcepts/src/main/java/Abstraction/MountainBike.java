package Abstraction;

class MountainBike extends Bicycle {

    MountainBike(){
        System.out.println("Hi this class is called MountainBike");
    }

    @Override
    void bikeModelName(String model) {
        System.out.println("Model of bike: " + model);
    }
}