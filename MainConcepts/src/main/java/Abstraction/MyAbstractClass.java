package Abstraction;

abstract class MyAbstractClass {

    final int i = 12;

    int j;

    abstract void sayHello();

    void sayHelloTwice(){
        System.out.println("hello hello");
    }
}