package Recursion;

public class FindAllIndex {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 3, 4, 3};
        int index[] = findAllIndex(arr, 0, 3, 0);
        for (int i : index) {
            System.out.println(i);
        }
    }

    private static int[] findAllIndex(int[] arr, int index, int num, int currentCount) {
        if (index == arr.length) {
            return new int[currentCount];
        }
        if (num == arr[index]) {
            int indexArray[] = findAllIndex(arr, index + 1, num, currentCount + 1);
            indexArray[currentCount] = index;
            return indexArray;
        } else {
            return findAllIndex(arr, index + 1, num, currentCount);
        }
    }


}
