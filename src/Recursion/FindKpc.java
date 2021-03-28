package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindKpc {
    public static void main(String[] args) {
        Map<Integer, String> keyMap = new HashMap<>();
        keyMap.put(0, ".;");
        keyMap.put(1, "abc");
        keyMap.put(2, "def");
        keyMap.put(3, "ghi");
        keyMap.put(4, "jkl");
        keyMap.put(5, "mno");
        keyMap.put(6, "pqrs");
        keyMap.put(7, "tu");
        keyMap.put(8, "vwx");
        keyMap.put(9, "yz");
        List<String> multiplications = findAllKpc("01", keyMap);
        System.out.println(multiplications.size());
        multiplications.forEach(str -> System.out.println(str));

    }

    private static List<String> findAllKpc(String input, Map<Integer, String> keyMap) {
        if (input.length() == 0) {
            List<String> kpcs = new ArrayList<>();
            kpcs.add("");
            return kpcs;
        }
        int first = Integer.parseInt(String.valueOf(input.charAt(0)));
        List<String> kpcs = findAllKpc(input.substring(1), keyMap);
        List<String> mykpc = new ArrayList<>();
        for (int i = 0; i < keyMap.get(first).length(); i++) {
            int finalI = i;
            for (String in : kpcs) {
                mykpc.add(keyMap.get(first).charAt(finalI) + in);
            }
        }
        return mykpc;
    }
}
