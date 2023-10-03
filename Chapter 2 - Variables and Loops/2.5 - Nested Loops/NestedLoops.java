public class NestedLoops {

    public static void main(String[] args) {
        loop1();
        loop2();
        loop3();
        loop4();
        loop5();
        loop6();
        loop7();
    }

    private static void loop1() {
        for (int i = 1; i < 7; i++) {
            for (int k = 1; k < i + 1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void loop2() {
        for (int i = 1; i < 6; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();
        }
    }

    private static void loop3() {
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("" + k + k + k);
            }
            System.out.println();
        }
    }

    private static void loop4() {
        for (int i = 1; i < 10; i += 2) {
            for (int k = 0; k < (11 - i) / 2; k++) {
                System.out.print("-");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(i);
            }
            for (int k = 0; k < (11 - i) / 2; k++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    private static void loop5() {
        for (int i = 9; i > 0; i--) {
            for (int k = i; k > i - 9; k--) {
                if (k > 0) {
                    System.out.print(k);
                } else {
                    System.out.print(k + 9);
                }
            }
            System.out.println();
        }
    }

    private static void loop6() {
        int array[] = new int[15];
        for (int i = 0; i < 15; i++) {
            if (i < 2) {
                array[i] = 1;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.print(array[i] + " ");
        }
    }

    private static void loop7() {
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 9; k++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int k = 1; k < 10; k++) {
                System.out.print(k);
            }
            System.out.print(0);
        }
        System.out.println();
    }

}   