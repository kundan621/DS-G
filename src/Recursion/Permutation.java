package Recursion;

public class Permutation {
    public static void main(String[] args) {
        findPermutation("aabc", "");

    }

    private static void findPermutation(String input, String answerSoFar) {
        if (input.length() == 0) {
            System.out.println(answerSoFar);
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String qlpart = input.substring(0, i);
            String qrpart = input.substring(i + 1);
            String roq = qlpart + qrpart;
            findPermutation(roq, answerSoFar + ch);
        }
    }
}
