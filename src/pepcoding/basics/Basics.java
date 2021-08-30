package pepcoding.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        boolean isNotPrime = false;
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            for (int j = 2; j <= n / 2; j++) {
                if (n % j == 0) {
                    isNotPrime = true;
                    break;
                }
            }
            if (!isNotPrime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        StringBuilder str = new StringBuilder("");
        Integer.parseInt(String.valueOf(str));

    }
}

