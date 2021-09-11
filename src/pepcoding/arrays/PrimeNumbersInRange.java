package pepcoding.arrays;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber = scanner.nextLong();
        long secondNumber = scanner.nextLong();

        boolean firstPrimeFound = false;
        boolean secondPrimeFound = false;
        long sum = 0;

        while (firstPrimeFound == false || secondPrimeFound == false) {
            firstPrimeFound = checkPrime(firstNumber);
            secondPrimeFound = checkPrime(secondNumber);
            if (firstPrimeFound && secondPrimeFound) {
                System.out.println(firstNumber + "" + secondNumber);
                sum = firstNumber + secondNumber;
            }
            if (!firstPrimeFound)
                firstNumber++;
            if (!secondPrimeFound)
                secondNumber--;

        }
        System.out.println(Math.abs(sum));
    }

    private static boolean checkPrime(long num) {
        boolean flag = false;
        for (long i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
    }
}
