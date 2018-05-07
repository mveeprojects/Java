package Level_1.Lab5_ObjectsAndArrays;

public class Data {

    private String name;
    private int age;

    Data(String n, int a) {
        name = n;
        age = a;
    }

    private String GetName() {
        return (name);
    }

    public void SetName(String n) {
        name = n;
    }

    private int GetAge() {
        return (age);
    }

    public void SetAge(int a) {
        age = a;
    }

    void Print() {
        System.out.print(("(" + GetName()));
        System.out.print(",");
        System.out.print(GetAge());
        System.out.println(") ");
    }
}