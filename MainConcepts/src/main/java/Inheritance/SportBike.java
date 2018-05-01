package Inheritance;

public class SportBike extends Bicycle {

    private int tyreWidth;

    public SportBike(int tyreWidth, int numOfGears, int height, String colour) {
        super(numOfGears, height, colour);
        this.tyreWidth = tyreWidth;
    }

    public int getTyreWidth() {
        return tyreWidth;
    }
}
