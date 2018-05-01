package Inheritance;

public class RoadBike extends SportBike {

    private int frameWeight;

    public RoadBike(int frameWeight, int tyreWidth, int numOfGears, int height, String colour) {
        super(tyreWidth, numOfGears, height, colour);
        this.frameWeight = frameWeight;
    }

    public int getFrameWeight() {
        return frameWeight;
    }
}
