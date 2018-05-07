package Arrays;

class ArrayStuff {

    private static int sum = 0;

    ArrayStuff() {
        populateAndPrint2DArray();
        otherArrayBasics();
    }

    private void populateAndPrint2DArray() {
        int rc = 4, val;
        int[][] aNewArray = new int[rc][rc];
        for (int row = 0; row < aNewArray.length; row++) {
            for (int col = 0; col < aNewArray[row].length; col++) {
                val = row * col;
                aNewArray[row][col] = val;
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void otherArrayBasics() {
        // create and initialise a 1D integer array
        int[] myArr = {4, 2, 12};

        // create and initialise a 2D integer array
        int[][] my2dArr = {{1, 2, 3}, {4, 5, 6}};

        // create independant copy of 2d array, changes to my2dArr will not effect clonedArr
        int[][] clonedArr = my2dArr.clone();
        my2dArr[1][1] = 204;

        // this would create a related copy of another array, changes to my2dArr will effect linkedArr
        int[][] linkedArr = my2dArr;
        my2dArr[1][2] = 4;

        print1DArraySum(myArr);
        print2DArraySum(my2dArr);
        print2DArraySum(clonedArr);
        print2DArraySum(linkedArr);
    }

    private void print1DArraySum(int[] arr) {
        sum = 0;
        for (int elementValue : arr) {
            sum += elementValue;
        }
        System.out.println(sum + "\n");
    }

    private void print2DArraySum(int[][] arr) {
        sum = 0;
        for (int[] anArr : arr) {
            for (int elementValue : anArr) {
                sum += elementValue;
            }
        }
        System.out.println(sum + "\n");
    }
}
