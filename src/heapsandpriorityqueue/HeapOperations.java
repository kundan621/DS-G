package heapsandpriorityqueue;

public class HeapOperations {
    public static void main(String[] args) {
        int arr[] = {5, 7, 8, 2, 5, 6, 4};
        //Ologn time: Valid only if apart from root everything else is in max heap
        System.out.println("max heapify");
        maxHeapify(arr, 0, arr.length);
        for (int number : arr) {
            System.out.println(number);
        }
        //o(n) time
        System.out.println("building max heap");
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        buildMaxHeap(arr1);
        for (int number : arr1) {
            System.out.println(number);
        }
        //operations on heap
        System.out.println(findMax(arr1));

        //heap sort
        System.out.println("heap sort");
        int arr3[] = {5, 3, 4, 6, 4, 2};

        //n+nlogn
        heapsort(arr3);
        for (int number : arr3) {
            System.out.println(number);
        }


    }


    private static int findMax(int[] arr1) {
        return arr1[0];
    }

    private static void heapsort(int[] arr3) {
        //o(n)
        buildMaxHeap(arr3);
        //n times *maxheapify(logn)=nlogn
        for (int i = arr3.length - 1; i > 0; i--) {
            int temp = arr3[0];
            arr3[0] = arr3[i];
            arr3[i] = temp;

            maxHeapify(arr3, 0, i);
        }

    }


    private static void buildMaxHeap(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            maxHeapify(arr, i, arr.length);
        }
    }

    private static void maxHeapify(int[] arr, int index, int heapSize) {
        int largest = 0;
        if (2 * index + 1 < heapSize && 2 * index + 2 < heapSize) {
            if (arr[2 * index + 1] < arr[2 * index + 2]) {
                largest = 2 * index + 2;
            } else {
                largest = 2 * index + 1;
            }
            if (arr[index] < arr[largest]) {
                int temp = arr[index];
                arr[index] = arr[largest];
                arr[largest] = temp;
                maxHeapify(arr, largest, heapSize);
            }

        }
    }
}
