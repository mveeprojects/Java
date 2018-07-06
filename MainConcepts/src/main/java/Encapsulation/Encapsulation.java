package Encapsulation;

public class Encapsulation {

    public Encapsulation(){
        System.out.println("\nEncapsulation:");

        Person p = new Person();
        p.setAge(32);
        p.setName("Bob");
        System.out.println(p.getName(true) + " is " + p.getAge(false));
    }
}