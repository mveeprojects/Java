package Creational_Patterns.AbstractFactoryPattern;

import Creational_Patterns.AbstractFactoryPattern.Interfaces.Colour;
import Creational_Patterns.AbstractFactoryPattern.Interfaces.Shape;
import Creational_Patterns.AbstractFactoryPattern.Objects.*;

class ColourFactory extends AbstractFactory {

    private static final String RED = "red";
    private static final String GREEN = "green";
    private static final String BLUE = "blue";

    @Override
    Shape getShape(String shape) {
        return null;
    }

    Colour getColour(String colour) {
        if (colour == null) {
            return null;
        } else if (colour.equalsIgnoreCase(RED)) {
            return new Red();
        } else if (colour.equalsIgnoreCase(GREEN)) {
            return new Green();
        } else if (colour.equalsIgnoreCase(BLUE)) {
            return new Blue();
        }
        return null;
    }
}