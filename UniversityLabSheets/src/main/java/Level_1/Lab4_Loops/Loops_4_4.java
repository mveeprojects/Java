package Level_1.Lab4_Loops;

class Loops_4_4 {

    Loops_4_4() {
        System.out.println("\n\n*** Loops 4.4 ***");
        basicForLoop();
        forLoop1();
        forLoop2();
        forLoop3();
        forLoop4();
        forLoop5();
        forLoop6();
        forLoop7();
    }

    private void basicForLoop() {
        System.out.print("Basic initial loop from lab sheet: ");
        for (int i = 0; i < 10; ++i) {
            System.out.print(i + " ");
        }
    }

    private void forLoop1() {
        System.out.print("\n" + "1) ");
        for (int i = 4; i < 12; i++) {
            System.out.print(i + " ");
        }
    }

    private void forLoop2() {
        System.out.print("\n" + "2) ");
        for (int i = 10; i < 20; i += 3) {
            System.out.print(i + " ");
        }
    }

    private void forLoop3() {
        System.out.print("\n" + "3) ");
        for (int i = 1; i < 17; i += 3) {
            System.out.print(i + " ");
        }
    }

    private void forLoop4() {
        System.out.print("\n" + "4) ");
        for (int i = 2; i < 13; i += 2) {
            System.out.print(i + " ");
        }
    }

    private void forLoop5() {
        System.out.print("\n" + "5) ");
        for (int i = 1; i < 11; i++) {
            System.out.print(i*i + " ");
        }
    }

    private void forLoop6() {
        System.out.print("\n" + "6) ");
        for (int i = -10; i < 11; i+=2) {
            System.out.print(i + " ");
        }
    }

    private void forLoop7() {
        System.out.print("\n" + "7) ");
        for (int i = -20; i < 21; i+=5) {
            if(i == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}