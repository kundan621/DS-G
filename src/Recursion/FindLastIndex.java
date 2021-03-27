package Recursion;

public class FindLastIndex {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 3, 4, 3};
        System.out.println(findLastIndex(arr, 0, 3));
    }

    private static int findLastIndex(int[] arr, int index, int num) {
        if (index == arr.length)
            return -1;
        int indexInSmall = findLastIndex(arr, index + 1, num);
        if (indexInSmall == -1) {
            if (arr[index] == num)
                return index;
            else
                return -1;
        } else
            return indexInSmall;
    }


}
