package Streams.ComparatorAndSorting;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

class ComparingAndSorting {

    ComparingAndSorting() {
        sortObjectsByField();
        comparatorToSortStringsInOrder();
        filterOutNullValues();
        searchMapForKeyAndPrintValue();
        filteringOutValueFromAList();
        filterOutObjectsByParameter();
        customComparator();
    }

    private void sortObjectsByField() {
        System.out.println("\nSorting Developer objects by age field:");
        List<Developer> listDevs = Arrays.asList(
                new Developer("Mark", new BigDecimal("7850000"), 30),
                new Developer("Bob", new BigDecimal("40000"), 48),
                new Developer("Sally", new BigDecimal("450000"), 12));
        listDevs.sort(Comparator.comparingInt(Developer::getAge));
        listDevs.forEach(System.out::println);
    }

    private void comparatorToSortStringsInOrder() {
        System.out.println("\nSorting a List of Strings in alphabetical order:");
        List<String> stringsToSort = Arrays.asList("hello world", "I like bacon", "programming is fun", "A is at the start of the alphabet");
        List<String> sortedStrings = stringsToSort.stream().sorted(String::compareToIgnoreCase).collect(toList());
        sortedStrings.forEach(System.out::println);
    }

    private void filterOutNullValues() {
        System.out.println("\nFiltering out (removing) null values from a List of Strings:");
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");
        List<String> result = language.filter(Objects::nonNull)
                .collect(toList());
        result.forEach(System.out::println);
    }

    private void searchMapForKeyAndPrintValue() {
        System.out.println("\nFiltering a Map by a given Key and returning its Value:");
        Map<Integer, String> hosting = new HashMap<>();
        hosting.put(1, "somesite");
        hosting.put(2, "anothersite");
        hosting.put(3, "yetanothersite");
        hosting.put(4, "somesite");
        hosting.put(5, null);

        Map<Integer, String> collect = hosting.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(collect);
    }

    private void filteringOutValueFromAList() {
        System.out.println("\nFiltering out a given value from a List of Strings:");
        List<String> lines = Arrays.asList("A", "B", "A");
        List<String> result = lines.stream()
                .filter(line -> !"B".equals(line))
                .collect(toList());
        result.forEach(System.out::println);
    }

    private void filterOutObjectsByParameter() {
        System.out.println("\nFiltering objects by a given parameter:");
        List<Developer> developers = Arrays.asList(
                new Developer("Mark", new BigDecimal("7850000"), 30),
                new Developer("Bob", new BigDecimal("40000"), 48),
                new Developer("Sally", new BigDecimal("450000"), 12));

        System.out.println(developers.stream()
                .filter(somePerson -> "Bob".equals(somePerson.getName()))
                .map(Developer::getName)
                .findAny()
                .orElse(""));

        System.out.println(developers.stream()
                .filter(somePerson -> "Mark".equals(somePerson.getName()))
                .findAny()
                .orElse(null));
    }

    private void customComparator(){
        System.out.println("\nUsing a customer Comparator to sort objects in a stream");
        List<Developer> developers = Arrays.asList(
                new Developer("Mark", new BigDecimal("7850000"), 30),
                new Developer("Bob", new BigDecimal("40000"), 48),
                new Developer("Sally", new BigDecimal("450000"), 12));

        Comparator<Developer> comparator = Comparator
                .comparingInt(Developer::getAge);

        developers.sort(comparator);
        developers.forEach(dev -> System.out.println(dev.getName() + " " + dev.getAge()));
    }
}