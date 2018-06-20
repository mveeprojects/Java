package Encapsulation;

class Person {

    private int age;
    private String name;

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge(boolean isAllowed) {
        return isAllowed ? age : 0;
    }

    String getName(boolean isAllowed) {
        return isAllowed ? name : "default name";
    }
}