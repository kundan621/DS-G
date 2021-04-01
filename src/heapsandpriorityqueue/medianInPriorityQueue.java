package heapsandpriorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class medianInPriorityQueue {
    public static class MedianPriorityQueue {
        java.util.PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        public MedianPriorityQueue() {
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }

        public int size() {
            return left.size() + right.size();
        }

        public int peek() {
            if (this.size() == 0) {
                System.out.println("underflow");
                return -1;
            } else if (left.size() >= right.size()) {
                return left.peek();
            } else {
                return right.peek();
            }
        }

        public int remove() {
            if (this.size() == 0) {
                System.out.println("underflow");
                return -1;
            } else if (left.size() >= right.size()) {
                return left.remove();
            } else {
                return right.remove();
            }
        }

        public void add(int val) {
            if (right.size() > 0 && val > right.peek()) {
                right.add(val);
            } else if (right.size() - left.size() == 2) {
                left.add(val);
            }
            if (left.size() - right.size() == 2) {
                right.add(left.remove());
            } else if (right.size() - left.size() == 2) {
                left.add(right.remove());
            }
        }
    }
}
