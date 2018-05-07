package Level_1.Lab7_BuiltInFunctions;

import static java.lang.String.format;

class BuiltInFunctions_7_4 {

    private double a = 10.200000;
    private double[] doubleList = {-100.1, 100.49, 100.5, -100.51, -100.9, 0, 100.1, 100.49, 100.5, 100.51, 100.9};

    BuiltInFunctions_7_4() {
        System.out.println("\n\n*** Built In Functions and Methods 7.4 ***");
        basicMathsMethods();
        stringDotFormatMethod();
    }

    private void basicMathsMethods() {
        System.out.println("\n" + "1) Maths: Ceil, Floor and Round");

        System.out.println("Ceil value of " + a + " is: " + Math.ceil(a));
        System.out.println("Floor value of " + a + " is: " + Math.floor(a));
        System.out.println("Round value of " + a + " is: " + Math.round(a));
    }

    private void stringDotFormatMethod() {
        System.out.println("\n" + "2) Maths: Formatting outputs");

        int a = 10;
        double b = 15.789;
        System.out.println(format("b = %2$.2f a=%1$d", a, b));
        formatAndPrintLotsOfDoubles();
    }

    private void formatAndPrintLotsOfDoubles() {
        for (double d : doubleList) {
            System.out.println(format("%1$.2f", d));
        }
    }
}