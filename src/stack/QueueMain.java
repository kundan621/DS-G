package stack;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
       /* queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);*/
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(15);
        //queue.enqueue(15)
    }

}


class Queue {
    int arr[] = new int[5];
    int head = 0;
    int size = 0;
    int tail = 0;

    void enqueue(int num) {
        if (queueFull()) {
            throw new RuntimeException("q full");
        }
        tail = tail % (arr.length - 1);
        size++;
        arr[tail++] = num;

    }

    int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        int x = arr[head];
        head = (head + 1) % (arr.length - 1);
        size--;
        return x;
    }

    private boolean queueFull() {
        if (size == arr.length) {
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }
}