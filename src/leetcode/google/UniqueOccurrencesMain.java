package leetcode.google;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class UniqueOccurrences implements Occurrence {
    private int arr[];
    Map<Integer, Integer> map;

    public UniqueOccurrences(int arr[]) {
        this.arr = arr;
    }

    @Override
    public boolean uniqueOccurrences() {
        map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        boolean result = true;
        Set<Integer> set = new HashSet<>();
        for (int val : map.values()) {
            if (set.contains(val)) {
                result = false;
                break;
            } else {
                set.add(val);
            }
        }
        return result;
    }

}


interface Occurrence {
    boolean uniqueOccurrences();
}

class UniqueOccurrencesMain {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1, 1, 3};
        Occurrence occurrence = new UniqueOccurrences(arr);
        System.out.println(occurrence.uniqueOccurrences());
    }

}