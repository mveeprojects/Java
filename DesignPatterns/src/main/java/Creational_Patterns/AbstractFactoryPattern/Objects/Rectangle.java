package Creational_Patterns.AbstractFactoryPattern.Objects;

import Creational_Patterns.AbstractFactoryPattern.Interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle draw() method.");
    }
}