package Creational_Patterns.AbstractFactoryPattern;

import Creational_Patterns.AbstractFactoryPattern.Interfaces.Colour;
import Creational_Patterns.AbstractFactoryPattern.Interfaces.Shape;

abstract class AbstractFactory {
    abstract Colour getColour(String colour);
    abstract Shape getShape(String shape);
}