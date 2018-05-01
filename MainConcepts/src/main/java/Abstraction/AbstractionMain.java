package Abstraction;

public class AbstractionMain {

    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle();
        myBicycle.setNumberOfWheels(2);
        System.out.println(myBicycle.getNumberOfWheels());
    }
}
