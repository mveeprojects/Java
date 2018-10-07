package Abstraction;

public class Abstraction {

    public Abstraction(){
        System.out.println("\nAbstraction:\n");
        useMountainBike();
        useRoadBike();
    }

    private void useMountainBike() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.printBikeBrand("Boardman");
        mountainBike.bikeModelName("Comp 650b");
        mountainBike.setNumofgears(12);
        System.out.println("Number of gears: " + mountainBike.getNumofgears() + "\n");
    }

    private void useRoadBike() {
        RoadBike roadBike = new RoadBike();
        roadBike.printBikeBrand();
        roadBike.printBikeBrand("Raleigh");
        roadBike.bikeModelName("Falcon");
        roadBike.setNumofgears(24);
        System.out.println("Number of gears: " + roadBike.getNumofgears());
    }
}