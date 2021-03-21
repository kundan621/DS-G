package DAC;

public class MaximumSubarraySum {

    /**
     * Solves the maximum subarray sum in O(N) time.
     */
    public static int solve1(int[] input) {

        int sum = input[0];
        int bestSum = sum;

        for (int i = 1; i < input.length; i++) {
            sum = Math.max(input[i], input[i] + sum);
            bestSum = Math.max(sum, bestSum);
        }

        return bestSum;
    }

    /**
     * Solves the maximum subarray sum in O(N^2) time. The two indices
     * 'start' and 'end' iterate over all possible N^2 index pairs, with
     * the sum of input[start, end] always computed for every 'end' value.
     */
    public static int solve2(int[] input) {

        int bestSum = -Integer.MAX_VALUE;

        for (int start = 0; start < input.length; start++) {

            // Compute the sum of input[start, end] and update
            // 'bestSum' if we found a new max subarray sum.

            // Set the sum to initial input value to handle edge case
            // of all the values being negative.
            int sum = input[start];
            bestSum = Math.max(sum, bestSum);

            for (int end = start+1; end < input.length; end++) {
                sum += input[end];
                bestSum = Math.max(sum, bestSum);
            }
        }

        return bestSum;
    }

    /**
     * Solves the maximum subarray sum in O(N^3) time. The two indices
     * 'start' and 'end' iterate over all possible N^2 index pairs, and
     * a third loop with index 'mid' iterates between them to compute
     * the sum of input[start, end].
     */
    public static int solve3(int[] input) {

        int bestSum = -Integer.MAX_VALUE;

        for (int start = 0; start < input.length; start++) {

            for (int end = start; end < input.length; end++) {

                // Compute the sum of input[start, end] using a third loop
                // with index 'mid'. Update 'bestSum' if we found a new
                // max subarray sum.

                // Set the sum to initial input value to handle edge case
                // of all the values being negative.
                int sum = input[start];
                bestSum = Math.max(sum, bestSum);

                for (int mid = start+1; mid < end; mid++) {
                    sum = Math.max(input[mid], input[mid] + sum);
                    bestSum = Math.max(sum, bestSum);
                }
            }
        }

        return bestSum;
    }


    public static void runTest(int[] input) {

        System.out.printf("\n");
        System.out.printf("Input: ");
        for (int i = 0; i < input.length; i++) {
            System.out.printf("%2d", input[i]);
            if (i < input.length-1) {
                System.out.printf(", ");
            }
        }
        System.out.printf("\n");

        int result = 0;

        result = MaximumSubarraySum.solve1(input);
        System.out.printf("solve1 result = %d\n", result);

        result = MaximumSubarraySum.solve2(input);
        System.out.printf("solve2 result = %d\n", result);

        result = MaximumSubarraySum.solve3(input);
        System.out.printf("solve3 result = %d\n", result);

        result = MaximumSubarraySum.solve4(input);
        System.out.printf("solve4 result = %d\n", result);


    }

    private static int solve4(int[] input) {
        int maxSum=Integer.MIN_VALUE;
        for(int start=0;start<input.length;start++){
            int sum=input[start];
            maxSum = Math.max(sum, maxSum);
            for(int end=start+1;end<input.length;end++){
                sum=sum+input[end];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String argv[]) {

        int test1[]={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        runTest(test1);

        int[] test2 = { -1,-2,-5,-7};
        runTest(test2);

        int[] test3 = { -2, -3, -4, -1, -2, -1, -5, -3 };
        runTest(test3);

        int[] test4 = { -2, -3,  4, -1, -2,  1,  5, -3 };
        runTest(test4);
    }
}