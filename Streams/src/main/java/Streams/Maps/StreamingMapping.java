package Streams.Maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class StreamingMapping {

    StreamingMapping() {
        stringsMapToUppercase();
        integersMapToSquaredValue();
        intToStringObjectStream();
        doubleToIntegerStream();
        objectFieldMapToStrings();
        mapFromOneObjectToAnother();
    }

    private void stringsMapToUppercase() {
        System.out.println("\nConverting lowercase letters to uppercase:");
        List<String> lowercaseStrings = Arrays.asList("a", "b", "c", "d");
        List<String> uppercaseStrings = lowercaseStrings.stream().map(String::toUpperCase).collect(toList());
        uppercaseStrings.forEach(System.out::println);
    }

    private void integersMapToSquaredValue() {
        System.out.println("\nConverting integers to their squares:");
        List<Integer> startingInts = Arrays.asList(1, 2, 3, 4);
        List<Integer> squaredInts = startingInts.stream().map(i -> i * i).collect(toList());
        squaredInts.forEach(System.out::println);
    }


    private void intToStringObjectStream() {
        System.out.println("\nIntStream example, including basic mapping of char to value:");
        IntStream.range(1, 5)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);
    }

    private void doubleToIntegerStream() {
        System.out.println("\nStreaming double values, mapping to ints and mapping char to value");
        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);
    }

    private void objectFieldMapToStrings() {
        System.out.println("\nConverting object fields to strings:");
        List<Person> people = Arrays.asList(new Person(30, "Mark"), new Person(28, "Gertrude"));
        List<String> names = people.stream().map(Person::getName).collect(toList());
        names.forEach(System.out::println);
    }

    private void mapFromOneObjectToAnother() {
        System.out.println("\nConverting 'person' objects to 'employee' objects:");
        List<Person> people = Arrays.asList(new Person(21, "bob"), new Person(23, "steve"));
        List<Employee> employees = people.stream()
                .map(person -> {
                    Employee employee = new Employee(person.getName(), person.getAge());
                    if (person.getAge() > 21) {
                        employee.setSalary(300000);
                    } else {
                        employee.setSalary(20);
                    }
                    return employee;
                }).collect(toList());
        employees.forEach(System.out::println);
    }
}