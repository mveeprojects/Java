package Level_1.Lab6_PsuedoCode;

class PsuedoToAlgos {

    PsuedoToAlgos() {
        double[] arr = {1, -6.3, 9000, 67.009, 1.1, 0.0, -456, 6, 23, -451.88};
        System.out.println(arrayMax(arr));
    }

    private double arrayMax(double[] arr) {
        double currentMax = 0;
        for (double d : arr) {
            if (d > currentMax) {
                currentMax = d;
            }
        }
        return currentMax;
    }
}