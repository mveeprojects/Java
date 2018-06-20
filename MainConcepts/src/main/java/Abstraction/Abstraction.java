package Abstraction;

public class Abstraction {

    public Abstraction() {
        System.out.println("\nAbstraction:");

        MyClass myClass = new MyClass();
        myClass.sayHello();

        MyOtherClass myOtherClass = new MyOtherClass();
        myOtherClass.sayHello();

        System.out.println("\'i\' = " + myClass.getIValue());
        System.out.println("\'j\' = " + myClass.getJValue());

        myClass.sayHelloTwice();
    }
}