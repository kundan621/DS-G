package Recursion;

import java.util.Scanner;

public class UpToDownAndDownToUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number from where to start");
        int num = scanner.nextInt();
        printSwing(num);
    }

    private static void printSwing(int num) {
        if (num < 1)
            return;
        System.out.println(num);
        printSwing(num - 1);
        System.out.println(num);
    }

}
