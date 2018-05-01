package Streams.RecursionAndReduction;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class RecursionReduction {

    RecursionReduction() {
        mapReduceSimpleStream();
        mapReduceFilteredStream();
        mapReduceByObjectFieldValue();
    }

    private void mapReduceSimpleStream() {
        System.out.println("\nMap reduction using a stream:");
        List<Student> studentList = Arrays.asList(
                new Student(18, "bob"),
                new Student(21, "dave")
        );

        System.out.println(studentList.stream()
                .map(Student::getAge)
                .reduce((age1, age2) -> age1 + age2)
                .orElse(0));
    }

    private void mapReduceFilteredStream() {
        System.out.println("\nMap reduction using a filtered stream:");
        List<Student> studentList = Arrays.asList(
                new Student(18, "bob"),
                new Student(21, "dave"),
                new Student(45, "bob")
        );

        System.out.println(studentList.stream()
                .filter(student -> Objects.equals(student.getName(), "bob"))
                .map(Student::getAge)
                .reduce((age1, age2) -> age1 + age2)
                .orElse(0));
    }


    private void mapReduceByObjectFieldValue() {
        System.out.println("\nMap reduce according to object field value:");
        List<Block> blocks = Arrays.asList(
                new Block("RED", 4),
                new Block("ORANGE", 12),
                new Block("RED", 21)
        );
        System.out.println(blocks
                .stream()
                .filter(b -> Objects.equals(b.getColour(), "RED"))
                .map(Block::getWeight)
                .reduce((integer, integer2) -> integer + integer2)
                .orElse(0));
    }
}