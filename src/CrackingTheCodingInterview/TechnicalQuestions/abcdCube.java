package CrackingTheCodingInterview.TechnicalQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
public class abcdCube {
    static class Key{
        int a;
        int b;
        public Key(int a,int b){
            this.a =a;
            this.b =b;
        }
    }
    //a3+b3=c3+d3  //range 1-1000
    public static void main(String[] args) {
        Map<Key,Integer> map=new HashMap<>();
        for(int a=0;a<1000;a++){
            for(int b=0;b<1000;b++){
                map.put(new Key(a,b),(a*a*a + b*b*b));
            }
        }
        for(int c=0;c<1000;c++){
            for(int d=0;d<1000;d++){
                if(c*c*c+d*d*d==map.get(new Key(c,d))){
                    System.out.println(c,d,map.);
                }
            }
        }

    }
}
*/

class Pair {
    int a;
    int b;

    Pair(int x, int y) {
        a = x;
        b = y;
    }
}


/*
public class abcdCube {
    public static void main(String[] args) {
        HashMap<Long, ArrayList<Pair>> hashMap = new HashMap<>();
        int n = 100;
        int count=0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                long sum = (long) (Math.pow(i, 3) + pow(j, 3));
                if(hashMap.containsKey(sum)) {
                    List<Pair> list = hashMap.get(sum);
                    for(Pair p : list) {
                        System.out.println(i + " " + j + " " + p.a + " " + p.b);
                        count++;
                    }
                } else {
                    ArrayList<Pair> list = new ArrayList<>();
                    hashMap.put(sum, list);

                }
                hashMap.get(sum).add(new Pair(i, j));
            }
        }
        System.out.println("count :"+count);
    }
}
*/


public class abcdCube {
    public static void main(String[] args) {
        HashMap<Long, List<Pair>> hashMap = new HashMap<>();
        int n = 5;
        int count = 0;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sum = i * i * i + j * j * j;
                if (hashMap.containsKey(sum)) {
                    List<Pair> pairs = hashMap.get(sum);
                    pairs.add(new Pair(i, j));
                    hashMap.put(sum, pairs);
                } else {
                    hashMap.put(sum, new ArrayList<Pair>());
                    List<Pair> pairs = hashMap.get(sum);
                    pairs.add(new Pair(i, j));
                    hashMap.put(sum, pairs);
                }
            }
        }
        for (int k = 1; k <= n; k++) {
            for (int l = 1; l <= n; l++) {
                sum = k * k * k + l * l * l;
                if (hashMap.containsKey(sum)) {
                    for (Pair pair : hashMap.get(sum)) {
                        System.out.println(k + " " + " " + l + " " + pair.a + " " + pair.b);
                        count++;
                    }
                }
            }
        }

        System.out.println("count :" + count);
    }
}
