package Level_1.Lab4;

class Loops_4_6 {

    Loops_4_6() {
        System.out.println("\n\n*** Loops 4.6 ***");
        whileVersionOfForLoop1();
        whileVersionOfForLoop2();
        highestCommonFactor();
    }

    private void whileVersionOfForLoop1() {
        System.out.print("While loop version of forLoop 1) ");
        int i = 0;
        while (i < 10) {
            System.out.print("+");
            i++;
        }
    }

    private void whileVersionOfForLoop2() {
        System.out.print("\n" + "While loop version of forLoop 2) ");
        int i = 0;
        while (i < 9) {
            System.out.print("-");
            i++;
        }
    }

    private void highestCommonFactor() {
        System.out.println("\n" + "Highest Common factors (Euclid's Algorithm):");
        euclidianAlgorithm(88,26);
        euclidianAlgorithm(54,87);
        euclidianAlgorithm(16,84);
        euclidianAlgorithm(55, 25);
        euclidianAlgorithm(42, 72);
        euclidianAlgorithm(77, 28);
        euclidianAlgorithm(80, 88);
    }

    private void euclidianAlgorithm(int val1, int val2) {
        int a = val1, b = val2;
        int c = (a % b);
        do {
            a = b;
            b = c;
            c = a % b;
        }
        while (c != 0);
        System.out.println("\t" + "HCF of " + val1 + " and " + val2 + " = " + b);
    }
}