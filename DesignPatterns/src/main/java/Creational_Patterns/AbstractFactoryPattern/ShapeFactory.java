package Creational_Patterns.AbstractFactoryPattern;

import Creational_Patterns.AbstractFactoryPattern.Interfaces.Colour;
import Creational_Patterns.AbstractFactoryPattern.Interfaces.Shape;
import Creational_Patterns.AbstractFactoryPattern.Objects.Circle;
import Creational_Patterns.AbstractFactoryPattern.Objects.Rectangle;
import Creational_Patterns.AbstractFactoryPattern.Objects.Square;

class ShapeFactory extends AbstractFactory {

    private static final String SQUARE = "square";
    private static final String RECT = "rectangle";
    private static final String CIRCLE = "circle";

    @Override
    Colour getColour(String colour) {
        return null;
    }

    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase(SQUARE)) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase(RECT)) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase(CIRCLE)) {
            return new Circle();
        }
        return null;
    }
}