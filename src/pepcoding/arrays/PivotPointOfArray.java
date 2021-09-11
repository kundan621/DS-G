package pepcoding.arrays;

import java.util.Arrays;

public class PivotPointOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(arr).sum();
        int currentLeftSum = 0;
        int currentRightSum;
        int index = -1;
        for (int i = 1; i < arr.length; i++) {
            currentLeftSum = currentLeftSum + arr[i - 1];
            currentRightSum = sum - currentLeftSum;
            if (currentLeftSum == currentRightSum) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
