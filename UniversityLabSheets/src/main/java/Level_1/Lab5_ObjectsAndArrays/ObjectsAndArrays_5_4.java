package Level_1.Lab5_ObjectsAndArrays;

class ObjectsAndArrays_5_4 {

    ObjectsAndArrays_5_4() {
        System.out.println("\n\n*** Objects and Arrays 5.4 ***");
        casting1();
        casting2();
    }

    private void casting1() {
        System.out.println("\nCasting example (double to int)");
        double x = 10.9;
        int y = (int) x;
        System.out.println(y);
    }

    private void casting2() {
        System.out.println("\nCasting example (int to byte)");
        Byte b = (byte) 127;
        System.out.println(b);
    }
}