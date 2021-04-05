package CrackingTheCodingInterview.Arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckGivenStringIsPermutationOfPalindrome {
    public static void main(String[] args) {
        // usingHashMap();
        usingArrayWay1();
    }

    private static void usingArrayWay1() {
        String test = "madaam";
        int arr[] = new int[Character.getNumericValue('z') - Character.getNumericValue('a')];
        for (int i = 0; i < test.length(); i++) {
            int num = getCharNumber(test.charAt(i));
            if (num != -1)
                arr[num]++;
        }
        int countOdd = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                countOdd++;
            }
        }
        if (countOdd <= 1) {
            System.out.println("yes");
        } else
            System.out.println("no");


    }

    private static int getCharNumber(char ch) {
        int aValue = Character.getNumericValue('a');
        int zValue = Character.getNumericValue('z');
        if (aValue <= Character.getNumericValue(ch) && Character.getNumericValue(ch) <= zValue)
            return Character.getNumericValue(ch) - Character.getNumericValue('a');
        else
            return -1;
    }

    private static void usingHashMap() {
        String test = "Tact Cao";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) != ' ') {
                if (map.containsKey(Character.toUpperCase(test.charAt(i)))) {
                    map.put(Character.toUpperCase(test.charAt(i)), map.get(Character.toUpperCase(test.charAt(i))) + 1);
                } else {
                    map.put(Character.toUpperCase(test.charAt(i)), 1);
                }
            }
        }
        int countOdd = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                countOdd++;
            }
        }
        if (countOdd <= 1) {
            System.out.println("yes");
        } else
            System.out.println("no");
    }
}
