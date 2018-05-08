package Creational_Patterns.AbstractFactoryPattern;

import Creational_Patterns.AbstractFactoryPattern.Interfaces.Colour;
import Creational_Patterns.AbstractFactoryPattern.Interfaces.Shape;

public class Application {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("RECT");
        shape3.draw();


        AbstractFactory colourFactory = FactoryProducer.getFactory("COLOUR");
        Colour colour1 = colourFactory.getColour("RED");
        colour1.fill();

        Colour colour2 = colourFactory.getColour("GREEN");
        colour2.fill();

        Colour colour3 = colourFactory.getColour("BLUE");
        colour3.fill();
    }
}