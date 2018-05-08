package Creational_Patterns.FactoryPattern.Objects;

import Creational_Patterns.FactoryPattern.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square draw() method.");
    }
}