package java8;

public class LearnInterface implements A, B {
    @Override
    public void display() {
        System.out.println("My name is kundan");
    }

    public void testMe(A a) {
        a.display();
    }
}

interface A {
    void display();

    default void printName() {
        System.out.println("My name is kundan");
    }
}

interface B {
    void display();
}

class Main {
    public static void main(String[] args) {
        LearnInterface obj = new LearnInterface();
        obj.display();
        obj.printName();
        B oneLamda = () -> System.out.println("hello");
        oneLamda.display();
        obj.testMe(() -> System.out.println("hello there!"));
    }
}

