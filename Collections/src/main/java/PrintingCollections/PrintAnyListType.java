package PrintingCollections;

import java.util.ArrayList;
import java.util.List;

class PrintAnyListType {

    private List<String> stringList = new ArrayList<>();
    private List<Integer> integerList = new ArrayList<>();
    private List<Long> longList = new ArrayList<>();
    private List<Double> doubleList = new ArrayList<>();
    private List<Boolean> booleanList = new ArrayList<>();
    private List<Person> personList = new ArrayList<>();

    PrintAnyListType() {
        populateEverything();
        printEverything();
    }

    private void populateEverything(){
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        integerList.add(1);
        integerList.add(2);

        longList.add(12132131442414141L);
        longList.add(57457745745745747L);

        doubleList.add(34.21321);
        doubleList.add(12.000);

        booleanList.add(true);
        booleanList.add(true);
        booleanList.add(false);

        personList.add(new Person("mark", 30));
        personList.add(new Person("bob", 23));
    }

    private void printEverything(){
        printArray(stringList);
        printArray(integerList);
        printArray(longList);
        printArray(doubleList);
        printArray(booleanList);
        printArray(personList);
    }

    private void printArray(List arr) {
        int k = 0;
        for (Object i : arr) {
            if (arr.get(k) instanceof Person) {
                String a = ((Person) arr.get(k)).getName();
                int b = ((Person) arr.get(k)).getAge();
                System.out.println(a + " " + b);
            } else {
                System.out.println(i);
            }
            k++;
        }
    }
}