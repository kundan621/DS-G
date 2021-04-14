package Recursion;

import java.util.Scanner;

//(n+1)*n  memory
//2^n-1*n characters otherwise in case of arraylist method
public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int stairs = scanner.nextInt();
        printStairPaths(stairs, "");


    }

    public static void printStairPaths(int n, String path) {
        System.out.println(print(n, 0, path));
    }

    private static int print(int total, int start, String path) {
        if (start > total) {
            return 0;
        }
        if (start == total) {
            System.out.println(path);
            return 1;
        }
        int count1 = print(total, start + 1, path + 1);
        int count2 = print(total, start + 2, path + 2);
        int count3 = print(total, start + 3, path + 3);

        return count1 + count2 + count3;
    }

}