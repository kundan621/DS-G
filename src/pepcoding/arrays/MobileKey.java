/*
package pepcoding.arrays;

import java.util.*;

public class MobileKey {
    public static void main(String[] args) {
        Map<Integer,String> keyMap=new HashMap<>();
        keyMap.put(2,"ABC");
        keyMap.put(3,"DEF");
        keyMap.put(4,"GHI");
        keyMap.put(5,"JKL");
        keyMap.put(6,"MNO");
        keyMap.put(7,"PQRS");
        keyMap.put(8,"TUV");
        keyMap.put(9,"WXYZ");
        int input=234;
        printAllPossibleWordsFromGivenKey(input,keyMap);
    }

    private static void printAllPossibleWordsFromGivenKey(String input, Map<Integer, String> keyMap) {

            for(int i=0;i<input.length();i++) {
                int digit=input.charAt(i);
                List<String> possibles = findAllPossibiles(input.)
                List<String> finalResult = new ArrayList<>();
                for (int j = 0; j < keyMap.get(digit).length(); j++) {
                    char newVal = keyMap.get(digit).charAt(j);
                    possibles.stream().forEach(val -> {
                                finalResult.add(val + newVal);
                            }
                    );
                }

                // return or print

            }
    }
    static int p=0;
    private static List<String> findAllPossibiles(String input) {
        if(input.length()==0){
            return "";
        }
        findAllPossibiles(input.substring(p));
        System.out.println(input.substring(p)+findAllPossibiles(input.substring(p+1)));
        p++;

    }
}
*/
