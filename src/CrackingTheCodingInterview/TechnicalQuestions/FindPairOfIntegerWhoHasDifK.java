package CrackingTheCodingInterview.TechnicalQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindPairOfIntegerWhoHasDifK {
    public static void main(String[] args) {
        int arr[] = {1, 7, 5, 9, 2, 12, 3, -1, -3};
        int k = 2;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int find = arr[i] + k;
            if (map.containsKey(find)) {
                System.out.println(arr[i] + " " + find);
            }
        }
    }
}
