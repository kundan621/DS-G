package pepcoding.arrays;

import java.util.Scanner;

public class SumOfNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int listSize = sc.nextInt();
        int minRange = sc.nextInt();
        int maxRange = sc.nextInt();
        int arr[] = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = minRange - 1; i <= maxRange - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
