package Streams.GeneralStreaming;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Streaming {

    private List<String> stringList = Arrays.asList("a1", "b2", "c4", "a5", "b6");
    private List<Integer> intList = Arrays.asList(1, 2, 3, 4);

    Streaming() {
        inlineArrayStream();
        integerRangeStream();
        doubleValueStream();
        integerAverageStream();
        findFirstMapStream();
        filterIntListStream();
        findMaxSubstringStream();
        fibonacciStream();
        nestedForLoopToStreams();
    }

    private void inlineArrayStream() {
        System.out.println("\nReturning all values within a given array of integers:");
        Arrays.stream(new int[]{1, 2, 3})
                .forEach(System.out::println);
    }

    private void integerRangeStream() {
        System.out.println("\nReturning (printing) integers within a given range:");
        IntStream.range(1, 5)
                .forEach(System.out::println);
    }

    private void doubleValueStream() {
        System.out.println("\nReturning (printing) all values within from a given array of double:");
        DoubleStream.of(2.2, 4.2)
                .forEach(System.out::println);
    }

    private void integerAverageStream() {
        System.out.println("\nFinding the average value in an array of integers:");
        Arrays.stream(new int[]{1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);
    }

    private void findFirstMapStream() {
        System.out.println("\nFind first instance of a string and return in uppercase:");
        String stringToFind = "a";
        stringList.stream()
                .filter(s -> s.startsWith(stringToFind))
                .findFirst()
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
        System.out.println();
    }

    private void filterIntListStream() {
        System.out.println("\nFiltering values in List of integers to find values under a given limit:");
        intList.stream()
                .filter(i -> i < 3)
                .forEach(System.out::println);
    }

    private void findMaxSubstringStream() {
        System.out.println("\nReturning max value from substrings:");
        stringList.stream()
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }

    private void fibonacciStream() {
        System.out.println("\nFibonnaci sequence as a stream:");
        BigInteger a = BigInteger.valueOf(0), b = BigInteger.valueOf(1);
        Tuple<BigInteger, BigInteger> seed = new Tuple<>(a, b);
        UnaryOperator<Tuple<BigInteger, BigInteger>> f = x -> new Tuple<>(x._2, x._1.add(x._2));

        Stream<BigInteger> fibonacciStream = Stream.iterate(seed, f)
                .map(x -> x._1)
                .limit(1000L);

        System.out.println(fibonacciStream
                .map(BigInteger::toString)
                .collect(Collectors.joining(", ")));
    }

    private void nestedForLoopToStreams() {
        System.out.println("\nNested for loop as a stream:");
        int i = 3, j = 4;
        IntStream.rangeClosed(1, i)
                .forEach(x -> IntStream.rangeClosed(1, j)
                        .forEach(y -> System.out.println(x * y)));
    }
}