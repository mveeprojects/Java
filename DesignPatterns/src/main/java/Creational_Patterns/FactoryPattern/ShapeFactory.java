package Creational_Patterns.FactoryPattern;

import Creational_Patterns.FactoryPattern.Objects.Circle;
import Creational_Patterns.FactoryPattern.Objects.Rectangle;
import Creational_Patterns.FactoryPattern.Objects.Square;

class ShapeFactory {

    private static final String SQUARE = "square";
    private static final String RECT = "rectangle";
    private static final String CIRCLE = "circle";

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