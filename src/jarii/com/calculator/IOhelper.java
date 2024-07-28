package jarii.com.calculator;

import java.util.Scanner;

public class IOhelper {
    private static final Scanner s_scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return s_scanner;
    }

    public static void closeScanner() {
        s_scanner.close();
    }
}