package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZeroOneKnapsackRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();
        int[] value = new int[numberOfItems];
        int[] weight = new int[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            value[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfItems; i++) {
            weight[i] = scanner.nextInt();
        }
        int bagSize = scanner.nextInt();
        printMaxValue(value, weight, bagSize, 0, 0);
        System.out.print(Collections.max(list));
    }

    private static ArrayList<Integer> list = new ArrayList<>();

    private static void printMaxValue(int[] value, int[] weight, int bagSize, int index, int ans) {
        if (bagSize < 0) {
            return;
        }
        if (index == value.length || bagSize == 0) {
            list.add(ans);
            return;
        }
        printMaxValue(value, weight, bagSize - weight[index], index + 1, ans + value[index]);
        printMaxValue(value, weight, bagSize, index + 1, ans + 0);
    }
}