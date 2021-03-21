package stack;

public class StackMainUsingArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }

}

class Stack{
    int arr[]=new int[10];
    int top=-1;
    void push(int num){
        if(!isStackFull()){
            top=top+1;
            arr[top]=num;
        }
        else
            throw new RuntimeException("stack full");
    }
    boolean isStackFull(){
        if(top==arr.length-1)
            return true;
            return false;
    }
    int pop(){
        if(top==-1)
            throw new RuntimeException("No elements to pop");
        else {
            return arr[top--];
        }
    }
}
