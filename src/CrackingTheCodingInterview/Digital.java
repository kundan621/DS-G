package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Digital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pairs = scanner.nextInt();
        List<String> list = new ArrayList<>();
        printNumberOfValidBrackets("", 0, 0, pairs * 2, list);
        System.out.println(list);
    }

    private static void printNumberOfValidBrackets(String answer, int openCount, int closeCount, int totalCount, List<String> list) {
        if (openCount != 0 && closeCount != 0 && openCount == closeCount) {
            list.add(answer);
            return;
        }

        if (openCount + closeCount > totalCount) {
            return;
        }
        printNumberOfValidBrackets(answer + "(", openCount + 1, closeCount, totalCount, list);
        printNumberOfValidBrackets(answer + ")", openCount, closeCount + 1, totalCount, list);
    }

}