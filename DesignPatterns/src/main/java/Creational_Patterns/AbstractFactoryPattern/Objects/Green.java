package Creational_Patterns.AbstractFactoryPattern.Objects;

import Creational_Patterns.AbstractFactoryPattern.Interfaces.Colour;

public class Green implements Colour {
    @Override
    public void fill() {
        System.out.println("Inside Green fill() method");
    }
}