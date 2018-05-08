package Creational_Patterns.FactoryPattern.Objects;

import Creational_Patterns.FactoryPattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle draw() method.");
    }
}