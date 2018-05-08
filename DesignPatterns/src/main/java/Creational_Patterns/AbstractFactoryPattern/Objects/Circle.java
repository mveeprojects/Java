package Creational_Patterns.AbstractFactoryPattern.Objects;

import Creational_Patterns.AbstractFactoryPattern.Interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle draw() method.");
    }
}