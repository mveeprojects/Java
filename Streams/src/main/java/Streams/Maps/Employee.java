package Streams.Maps;

class Employee {

    private int age;
    private String name;
    private int salary;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }
}