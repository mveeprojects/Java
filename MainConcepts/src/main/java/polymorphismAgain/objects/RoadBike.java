package polymorphismAgain.objects;

public class RoadBike extends Bicycle {

    private int numOfGears;

    public RoadBike(int numWheels, int startSpeed, int numOfGears) {
        super(numWheels, startSpeed);
        this.numOfGears = numOfGears;
    }

    public int getNumOfGears() {
        return numOfGears;
    }
}