package com.pardxa.levio.q2;

public class NoLooprinter {
    private NoLooprinter() {
    }

    private static void printN(int num, String str) {
        if (num > 0) {
            System.out.print(str);
            printN(num - 1, str);
        }
    }

    public static void printAll(int N) {
        printN(N, "a");
        printN(N, "b");
    }

}
