package Recursion;

public class TargetSumOfSubsets {

    public static void main(String[] args) throws Exception {
        int arr[] = {5, 10, 15, 20, 25, 30};
        printTargetSumSubsets(arr, 0, "", 0, 30);

    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] array, int index, String currentSet, int sumOfSubset, int target) {
        if (target < sumOfSubset)
            return;

        if (index == array.length) {
            if (sumOfSubset == target) {
                System.out.println(currentSet);
            }
            return;
        }


        printTargetSumSubsets(array, index + 1, currentSet + " " + array[index], sumOfSubset + array[index], target);
        printTargetSumSubsets(array, index + 1, currentSet, sumOfSubset, target);
    }

}