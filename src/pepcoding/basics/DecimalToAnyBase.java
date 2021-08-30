package pepcoding.basics;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        StringBuilder str = new StringBuilder("");
        while (n != 0) {
            str = str.append(n % b);
            n = n / b;
        }
        return Integer.parseInt(String.valueOf(str.reverse()));
    }
}
