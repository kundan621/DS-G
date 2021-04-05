package heapsandpriorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class medianInPriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        java.util.PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        int arr[] = {10, 20, 30};
        for (int i = 0; i < arr.length; i++)
            printMedian(arr[i], minPQ, maxPQ);
    }

    //123(max) 456(min)
    private static void printMedian(int num, PriorityQueue<Integer> minPQ, PriorityQueue<Integer> maxPQ) {

        if (maxPQ.isEmpty() || maxPQ.peek() > num) {
            maxPQ.add(num);
        } else {
            minPQ.add(num);
        }
        if (minPQ.size() > maxPQ.size() + 1) {
            maxPQ.add(minPQ.remove());
        } else if (maxPQ.size() > minPQ.size() + 1) {
            minPQ.add(maxPQ.remove());
        }
        if (minPQ.size() > maxPQ.size()) {
            System.out.println(minPQ.peek());
        } else if (minPQ.size() < maxPQ.size()) {
            System.out.println(maxPQ.peek());
        } else
            System.out.println((maxPQ.peek() + minPQ.peek()) / 2);

    }
}
