package Inheritance;

public class MountainBike extends SportBike  {

    private boolean fullSuspension;

    public MountainBike(boolean fullSuspension, int tyreWidth, int numOfGears, int height, String colour) {
        super(tyreWidth, numOfGears, height, colour);
        this.fullSuspension = fullSuspension;
    }

    public boolean getFullSuspension() {
        return fullSuspension;
    }
}
