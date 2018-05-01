package Inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(4,4,"blue");
        SportBike sportBike = new  SportBike(4,4,4,"blue");
        RoadBike roadBike = new RoadBike(8, 1, 24, 27, "red");
        MountainBike mountainBike = new MountainBike(false, 3, 11, 24, "green");

        System.out.println("The standard Bicycle has " + bicycle.getNumOfGears() + " gears");
        System.out.println("The Sports Bike has a tyre width of " + sportBike.getTyreWidth() + " inches");
        System.out.println("The colour of the Road Bike is " + roadBike.getColour());

        String s;
        if (!mountainBike.getFullSuspension()) {
            s = "does not";
        } else {
            s = "does";
        }

        System.out.println("The Mountain Bike " + s + " have full suspension");
    }
}
