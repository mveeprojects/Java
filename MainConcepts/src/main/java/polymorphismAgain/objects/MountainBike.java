package polymorphismAgain.objects;

public class MountainBike extends Bicycle {

    private String suspensionType;

    public MountainBike(int numWheels, int startSpeed, String suspensionType) {
        super(numWheels, startSpeed);
        this.suspensionType = suspensionType;
    }

    public String getSuspensionType() {
        return suspensionType;
    }
}