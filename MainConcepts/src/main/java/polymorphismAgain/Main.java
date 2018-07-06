package polymorphismAgain;

import polymorphismAgain.objects.Bicycle;
import polymorphismAgain.objects.MountainBike;
import polymorphismAgain.objects.RoadBike;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(2, 5);
        MountainBike mountainBike = new MountainBike(2, 10, "hardtail");
        RoadBike roadBike = new RoadBike(2, 20, 21);

        List<Bicycle> bikes = new ArrayList();
        bikes.add(bicycle);
        bikes.add(mountainBike);
        bikes.add(roadBike);

        bikes.forEach(y -> System.out.println(y.getStartSpeed()));
    }
}