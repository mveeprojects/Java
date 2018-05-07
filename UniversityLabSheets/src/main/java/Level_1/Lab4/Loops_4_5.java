package Level_1.Lab4;

class Loops_4_5 {

    Loops_4_5() {
        System.out.println("\n\n*** Loops 4.5 ***");
        basicLoop();
        loop1();
        loop2();
        loop3();
        loop4();
        loop5();
        loop6();
        loop7();
        loop8();
    }

    private void basicLoop() {
        System.out.print("Basic initial loop from lab sheet: ");
        for (int i = 0; i < 10; ++i) {
            System.out.print("*");
        }
    }

    private void loop1() {
        System.out.print("\n" + "1) ");
        for (int i = 0; i < 10; i++) {
            System.out.print("+");
        }
    }

    private void loop2() {
        System.out.print("\n" + "2) ");
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
    }

    private void loop3() {
        System.out.print("\n" + "3) ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
                continue;
            }
            System.out.print("-");
        }
    }

    private void loop4() {
        System.out.print("\n" + "4) ");
        for (int i = 0; i < 3; i++) {
            System.out.print("*+-");
        }
    }

    private void loop5() {
        System.out.print("\n" + "5) ");
        for (int i = 0; i < 3; i++) {
            System.out.print("*+-");
        }
        System.out.print("*");
    }

    private void loop6() {
        System.out.print("\n" + "6) ");
        for (int i = 0; i < 3; i++) {
            System.out.print("**++");
        }
    }

    private void loop7() {
        System.out.print("\n" + "7) ");
        for (int i = 0; i < 2; i++) {
            System.out.print("***+++---");
        }
    }

    private void loop8() {
        System.out.print("\n" + "8) ");
        for (int i = 0; i < 6; i++) {
            if ((i == 0) || (i == 5)) {
                System.out.print("***");
            } else if ((i == 1) || (i == 4)) {
                System.out.print("+++");
            } else {
                System.out.print("---");
            }
        }
    }
}