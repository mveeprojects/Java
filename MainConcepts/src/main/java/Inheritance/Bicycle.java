package Inheritance;

public class Bicycle {

    private int numOfGears;
    private int height;
    private String colour;

    public Bicycle(int numOfGears, int height, String colour) {

        this.numOfGears = numOfGears;
        this.height = height;
        this.colour = colour;
    }

    public int getNumOfGears() {
        return numOfGears;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }
}
