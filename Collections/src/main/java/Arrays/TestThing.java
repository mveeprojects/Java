package Arrays;

public class TestThing {

    private static testBytes testBytes = null;

    public TestThing(String bob) {
    }

    public static void main(String[] args) {
        testBytes = instanceOfTestBytes();
        testBytes.compare();
        testBytes = instanceOfTestBytes();
        testBytes.compare();
    }

    private static testBytes instanceOfTestBytes() {
        if (testBytes == null) {
            System.out.println("Creating a new object");
            return new testBytes();
        }
        return testBytes;
    }
}

class testBytes {

    private Byte byte1;
    private Byte byte2;

    testBytes() {
        byte1 = new Byte("1");
        byte2 = new Byte("4");
    }

    void compare() {
        System.out.println("Compare equality (numerical)" + byte1.compareTo(byte2));
        System.out.println("Compare equality (object reference)" + byte1.equals(byte2));
        System.out.println("Compare equality (hashcode)" + byte1.equals(byte2));
    }
}