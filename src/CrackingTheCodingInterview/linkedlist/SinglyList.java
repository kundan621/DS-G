package CrackingTheCodingInterview.linkedlist;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class SinglyList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);
        linkedList.add(15);
        linkedList.add(30);
        linkedList.stream().forEach(item -> System.out.println(item.intValue()));
        LinkedList<Integer> list = new LinkedList<>(linkedList);
        HashSet<Integer> set = new HashSet<>();
        AtomicInteger i = new AtomicInteger();
        linkedList.stream().forEach(item -> {

            if (set.contains(Integer.valueOf(item.intValue()))) {
                list.remove(i.intValue());
            } else {
                set.add(item.intValue());
            }
            i.getAndIncrement();

        });
        System.out.println("Linked list after duplicate removal");
        list.stream().forEach(item -> System.out.println(item.intValue()));
    }
}
