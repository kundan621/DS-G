package heapsandpriorityqueue;

import java.util.PriorityQueue;

//K sorted means displaced at most k position from where it should be.
public class KSortedArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 4, 6, 7, 5, 8, 9};
        sort(arr, 2);


    }

    //space k time nlogk
    private static void sort(int[] arr, int k) {

        java.util.PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k + 1; i < arr.length; i++) {
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }

        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }


    }
}
