package Level_1.Lab7_BuiltInFunctions;

import java.text.DecimalFormat;

class Strings {

    private String a = "Hello", b = "World";
    private double x = 123.456, y = 17/3, z = Math.sqrt(2);


    Strings() {
        System.out.println("\n\n*** Built In Functions and Methods 7.3 ***");
        formatting2dp();
        formatting3dp();
        countDigits();
        reverseAndConcat();
    }

    private void formatting2dp(){
        System.out.println("\n" + "Example: 2dp formatting");

        double number = 1.0/3.0;
        DecimalFormat number_format = new DecimalFormat("#.##");

        System.out.println(number);
        String formatted_string = number_format.format(number);
        System.out.println(formatted_string);
    }

    private void formatting3dp() {
        System.out.println("\n" + "1) 3dp formatting");

        double a = Double.parseDouble("17");
        double b = Double.parseDouble("3");
        double result = a/b;
        DecimalFormat number_format = new DecimalFormat("#.###");

        String formatted_string = number_format.format(result);
        System.out.println(formatted_string);
    }

    private void countDigits(){
        System.out.println("\n" + "2) Count digits before and after decimal point");

        String resultX = String.valueOf(x);
        String resultY = String.valueOf(y);
        String resultZ = String.valueOf(z);

        splitStringAtDecimalPointAndPrint(resultX, "x");
        splitStringAtDecimalPointAndPrint(resultY, "y");
        splitStringAtDecimalPointAndPrint(resultZ, "z");
    }

    private void splitStringAtDecimalPointAndPrint(String string, String evaluatedString){
        String[] split = string.split("\\.");
        String beforeDecimalPoint = split[0];
        String afterDecimalPoint = split[1];

        System.out.println("Number of characters before decimal place for " + evaluatedString + ": " + beforeDecimalPoint.length());
        System.out.println("Number of characters after decimal place: for " + evaluatedString + ": " + afterDecimalPoint.length());
    }

    private void reverseAndConcat() {
        System.out.println("\n" + "3) Reverse a string and concatenate with another String");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        String c = String.valueOf(stringBuilder.reverse()) + " " + b;

        System.out.println(c);
    }
}
