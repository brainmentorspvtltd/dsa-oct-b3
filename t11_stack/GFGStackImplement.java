import java.util.Arrays;

public class GFGStackImplement{
    public static void main(String[] args) {
        myStack obj = new myStack(50);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.toString()); // 123
        obj.pop();
        obj.pop();
        obj.pop();
        System.out.println(obj.toString()); // 12?
        System.out.println(obj.peek()); // 2
    }
}
class myStack {
    int[] arr = null;
    int top = -1;
    public myStack(int n) {
        // Define Data Structures
        arr = new int[n];
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top==-1;
    }

    public boolean isFull() {
        // check if the stack is full
        return top == arr.length-1;
    }

    public void push(int x) {
        if(isFull()){
            System.out.println("Stack is full: "+x);
            return;
        }
        // Inserts x at the top of the stack
        top++;
        arr[top] = x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        // 1 2 3
        // . T .
        System.out.println(arr[top]);
        top--;
    }

    public int peek() {
        if(isEmpty()){
            return -1;
        }
        // Returns the top element of the stack
        return arr[top];
    }

    @Override
    public String toString() {
        return "myStack [arr=" + Arrays.toString(arr) + "]";
    }

    
}