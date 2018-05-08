package Creational_Patterns.FactoryPattern.Objects;

import Creational_Patterns.FactoryPattern.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle draw() method.");
    }
}