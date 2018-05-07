package Level_1.Lab7_BuiltInFunctions;

import java.util.Random;

class BuiltInFunctions_7_6 {

    BuiltInFunctions_7_6() {
        randomNumberStuff();
    }

    private void randomNumberStuff() {
        System.out.println("\n" + "1) Random number stuff");

        Random rand = new Random();
        for (int i = 0; i < 10; ++i) {
            System.out.println(rand.nextInt());
        }
    }
}