package pepcoding.arrays;

import java.util.Date;


//

public class Test {
    static {
        i = 5;
    }

    static int i;

    public static void main(String[] args) {
        System.out.println("i value is " + j);
    }

    static int j = 5;
}

class Employee {
    private final String name;
    private final Date date;

    public Employee(String name, Date date) {
        this.name = name;
        this.date = date;
        System.out.println(date);
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}