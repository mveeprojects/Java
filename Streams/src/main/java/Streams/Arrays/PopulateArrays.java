package Streams.Arrays;

import java.util.stream.IntStream;

class PopulateArrays {

    private final int rows = 3, columns = 2;
    private Integer[][] resultWithStream = new Integer[rows][columns];
    private Object[][] resultWithStreamAndConditional = new Object[rows][columns];

    PopulateArrays() {
        populateArrayWithStream();
        populateArrayWithStreamAndConditionalOperator();
    }

    private void populateArrayWithStream() {
        System.out.println("\nPopulating all array elements with a given value (12) using streaming:");
        IntStream.range(0, rows)
                .forEach(r -> IntStream.range(0, columns)
                        .forEach(c -> resultWithStream[r][c] = 12));
        printArray(resultWithStream);
    }

    private void populateArrayWithStreamAndConditionalOperator() {
        System.out.println("\nPopulating all array elements with a different values using streaming:");
        resultWithStreamAndConditional[0][0] = "Status";
        resultWithStreamAndConditional[0][1] = "Frequency";
        IntStream.range(1, rows)
                .forEach(r -> IntStream.range(0, columns)
                        .forEach(c -> {
                            if (c % 2 == 0) {
                                resultWithStreamAndConditional[r][c] = "Some status";
                            } else {
                                resultWithStreamAndConditional[r][c] = r;
                            }
                        })
                );
        printArray(resultWithStreamAndConditional);
    }

    private void printArray(Object[][] result) {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(result[row][column] + "\t\t");
            }
            System.out.println();
        }
    }
}