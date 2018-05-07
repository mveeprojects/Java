package Level_1.Lab4_Loops;

class Loops_4_7 {

    Loops_4_7() {
        System.out.println("\n\n*** Loops 4.7 ***");
        basicLoop();
        loop1();
        loop2();
        loop3();
        loop4();
        loop5();
        loop6();
        loop7();
        loop8();
        pairsOneToTen();
        pairsXAndY();
        pairsGivenRange();
    }

    private void basicLoop() {
        System.out.print("Basic initial loop from lab sheet: ");
        for (int i = 1; i < 5; ++i) {
            for (int j = 1; j < i + 1; ++j) {
                System.out.print(i);
            }
        }
    }

    private void loop1() {
        System.out.print("\n" + "1) ");
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i);
            }
        }
    }

    private void loop2() {
        System.out.print("\n" + "2) ");
        for (int i = 2; i <= 6; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i);
            }
        }
    }

    private void loop3() {
        System.out.print("\n" + "3) ");
        for (int i = 1; i <= 6; i += 2) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i);
            }
        }
    }

    private void loop4() {
        System.out.print("\n" + "4) ");
        for (int i = 1; i <= 7; i += 2) {
            for (int j = 1; j <= i; j += 2) {
                System.out.print(i);
            }
        }
    }

    private void loop5() {
        System.out.print("\n" + "5) ");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
                if (i == 1) {
                    System.out.print("2");
                }
            }
        }
    }

    private void loop6() {
        System.out.print("\n" + "6) ");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i);
            }
        }
    }

    private void loop7() {
        System.out.print("\n" + "7) ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("+");
                }
            }
        }
    }

    private void loop8() {
        System.out.print("\n" + "8) ");
        for (int i = 2; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 2 || i == 5) {
                    System.out.print("-");
                } else if (i == 3 || i == 6) {
                    System.out.print("*");
                } else {
                    System.out.print("+");
                }
            }
        }
    }

    private void pairsOneToTen() {
        System.out.println("\n\n" + "All possible pairs of numbers between 1 and 10:");
        checkAllPairs(1, 10, 1, 10, "");
    }

    private void pairsXAndY() {
        System.out.println("\n" + "All possible pairs of numbers between X and Y:");
        System.out.println("Of the form: \"0 < x < y\" and \"0 < y < 11\"");
        checkAllPairs(1, 9, 1, 10, "something");
    }

    private void pairsGivenRange() {
        System.out.println("\n" + "All possible pairs of numbers between 1-4 and 4-8:");
        checkAllPairs(1, 4, 4, 8, "");
    }

    private void checkAllPairs(int xStart, int xEnd, int yStart, int yEnd, String queryType) {
        int count = 0;
        for (int x = xStart; x <= xEnd; x++) {
            for (int y = yStart; y <= yEnd; y++) {
                if ("something".equals(queryType) & x < y) {
                    System.out.print(x + "," + y + " | ");
                    count++;
                } else if ("".equals(queryType)) {
                    System.out.print(x + "," + y + " | ");
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("Total combinations: " + count);
    }
}