package Recursion;

import java.util.Scanner;

//(n+1)*n  memory
//2^n-1*n characters otherwise in case of arraylist method
public class PrintSubsequences {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        if (str.equals("")) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        printSS(ros, ans + ch);
        printSS(ros, ans + "");
    }

}