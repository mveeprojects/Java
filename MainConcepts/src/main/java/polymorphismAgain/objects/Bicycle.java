package polymorphismAgain.objects;

public class Bicycle {

    private int numWheels;
    private int startSpeed;

    public Bicycle(int numWheels, int startSpeed){
        this.numWheels = numWheels;
        this.startSpeed = startSpeed;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getStartSpeed() {
        return startSpeed;
    }
}