package dp;

public class Fibonacci {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis() / 1000;
        System.out.println(fibUsingRecursion(45));
        long time2 = System.currentTimeMillis() / 1000;
        System.out.println("time taken in recursion " + (time2 - time1));


        long time3 = System.currentTimeMillis() / 1000;
        System.out.println(fibUsingIteration(45));
        long time4 = System.currentTimeMillis() / 1000;
        System.out.println("time taken in iteration " + (time4 - time3));


        long time5 = System.currentTimeMillis() / 1000;
        System.out.println(fibUsingRecursionUsingDPMemoization(45, new int[45 + 1]));
        long time6 = System.currentTimeMillis() / 1000;
        System.out.println("time taken in iteration " + (time6 - time5));
    }


    private static int fibUsingRecursionUsingDPMemoization(int i, int memory[]) {
        int num1;
        int num2;
        if (memory[i] != 0) {
            return memory[i];
        }
        if (i == 0 || i == 1) {
            return i;
        } else
            num1 = fibUsingRecursionUsingDPMemoization(i - 1, memory);
        num2 = fibUsingRecursionUsingDPMemoization(i - 2, memory);
        int sum = num1 + num2;
        memory[i] = sum;
        return sum;
    }

    private static int fibUsingIteration(int num) {
        int currentm2 = 0;
        int currentm1 = 1;
        int current = 0;

        for (int i = 2; i <= num; i++) {
            current = currentm1 + currentm2;
            currentm2 = currentm1;
            currentm1 = current;

        }
        return current;
    }

    private static int fibUsingRecursion(int i) {
        if (i == 0 || i == 1) {
            return i;
        } else
            return fibUsingRecursion(i - 1) + fibUsingRecursion(i - 2);

    }
}
