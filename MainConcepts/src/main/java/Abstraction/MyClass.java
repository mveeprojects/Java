package Abstraction;

public class MyClass extends MyAbstractClass {

    @Override
    public void sayHello() {
        System.out.println("hi");
    }

    int getIValue() {
        return i;
    }

    int getJValue() {
        return j;
    }
}