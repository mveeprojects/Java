package Polymorphism;

public class Animal {

    private int age;
    private int numOfLegs;
    private String name;

    Animal(int age, int numOfLegs, String name){
        this.age = age;
        this.numOfLegs = numOfLegs;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public String getName() {
        return name;
    }
}