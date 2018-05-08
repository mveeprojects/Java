package Creational_Patterns.AbstractFactoryPattern;

public class FactoryProducer {

    private static final String COLOUR = "colour";
    private static final String SHAPE = "shape";

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase(COLOUR)) {
            return new ColourFactory();
        } else if (choice.equalsIgnoreCase(SHAPE)) {
            return new ShapeFactory();
        }
        return null;
    }
}