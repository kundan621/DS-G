package leetcode.paypal;

public class ReversePairMergeSort {
    static int count = 0;

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 5, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(count);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    private static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);

        }

    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] leftSortedArray = new int[mid - start + 1];
        int p = 0, q = 0;
        for (int i = start; i <= mid; i++) {
            leftSortedArray[p++] = arr[i];
        }
        int rightSortedArray[] = new int[end - (mid + 1) + 1];
        for (int i = mid + 1; i <= end; i++) {
            rightSortedArray[q++] = arr[i];
        }

        int leftPointer1 = 0;
        int rightPointer1 = 0;
        while (leftPointer1 < leftSortedArray.length && rightPointer1 < rightSortedArray.length) {
            if (leftSortedArray[leftPointer1] > 2 * rightSortedArray[rightPointer1]) {
                count++;
                rightPointer1++;
            } else {
                leftPointer1++;
            }
        }


        int leftPointer = 0;
        int rightPointer = 0;
        int finalIterator = start;
        while (leftPointer < leftSortedArray.length && rightPointer < rightSortedArray.length) {
            if (leftSortedArray[leftPointer] >= rightSortedArray[rightPointer]) {


                arr[finalIterator++] = rightSortedArray[rightPointer];
                rightPointer++;


            } else {
                arr[finalIterator++] = leftSortedArray[leftPointer];
                leftPointer++;
            }
        }
        if (leftPointer == leftSortedArray.length) {
            for (int i = rightPointer; i < rightSortedArray.length; i++) {
                arr[finalIterator++] = rightSortedArray[i];
            }
        }

        if (rightPointer == rightSortedArray.length) {
            for (int i = leftPointer; i < leftSortedArray.length; i++) {
                arr[finalIterator++] = leftSortedArray[i];
            }
        }

    }


}
