package heapsandpriorityqueue;

public class PriorityQueue {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 1, 9, 8, 4};
        System.out.println(findKSmallest(arr, 3));
    }

    private static int findKSmallest(int[] arr, int k) {
        //by default pq is min. if we wanna make is max we have to insert Collections.reverseOrder()
        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue();

        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                priorityQueue.add(arr[i]);
            } else {
                if (arr[i] < priorityQueue.peek()) {
                    priorityQueue.remove();
                    priorityQueue.add(arr[i]);
                }
            }
        }
        for (int i = 0; i < k - 1; i++) {
            System.out.println(priorityQueue.peek());
            priorityQueue.remove();
        }
        return priorityQueue.peek();

    }
}
