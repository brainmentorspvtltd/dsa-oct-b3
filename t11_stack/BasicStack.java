import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        // myStack.push("three");
        myStack.push(4);
        System.out.println(myStack);
        System.out.println(myStack.pop());

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
    }
}
