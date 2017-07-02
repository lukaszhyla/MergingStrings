package pl.lhyla;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        int tests;
        scanner = new Scanner(System.in);
        tests = scanner.nextInt();
        for (int i = 0; i < tests; i++) {
            System.out.println(stringMerging());
        }
    }

    private static String stringMerging() {
        String firstWord;
        String secondWord;
        firstWord = scanner.next();
        secondWord = scanner.next();

        int shorterWord = firstWord.length();
        if (secondWord.length() < shorterWord) {
            shorterWord = secondWord.length();
        }
        String newString="";
        for (int i = 0; i < shorterWord; i++) {
            newString += firstWord.charAt(i);
            newString += secondWord.charAt(i);
        }

        return newString;
    }
}
