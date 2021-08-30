package pepcoding.basics;

public class Generics {
    public static void main(String[] args) {
        Print<String> print = new Print<>("hell0");
        Number num = 8;
        System.out.println(num);
        print.setMessage("hello");
        System.out.println(print.getMessage());
    }
}

class Print<Kundan> {
    private Kundan message;

    public Print(Kundan message) {
        this.message = message;
    }

    void setMessage(Kundan message) {
        this.message = message;
    }

    Kundan getMessage() {
        return message;
    }
}