package Recursion;

public class FindFirstIndex {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 3, 4, 3};
        System.out.println(findFirstIndex(arr, 0, 3));
        System.out.println(findFirstIndexNotGood(arr, 0, 3));
    }

    private static int findFirstIndexNotGood(int[] arr, int index, int num) {
        if (index == arr.length)
            return -1;
        int indexInSmall = findFirstIndexNotGood(arr, index + 1, num);
        if (num == arr[index]) {
            return index;
        } else
            return indexInSmall;
    }


    private static int findFirstIndex(int[] arr, int index, int num) {
        if (index == arr.length)
            return -1;
        if (arr[index] == num)
            return index;
        else return findFirstIndex(arr, index + 1, num);

    }
}
