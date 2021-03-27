package Recursion;

public class MaxOfNumber {
    public static void main(String[] args) {
        int arr[] = {10, 20, 70, 40, 50};
        System.out.println(findMax(arr, 0));

    }


    private static int findMax(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];
        return Math.max(arr[index], findMax(arr, index + 1));

    }
}
