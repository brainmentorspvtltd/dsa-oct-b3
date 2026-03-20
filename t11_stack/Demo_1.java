import java.util.ArrayDeque;
import java.util.Stack;

public class Demo_1 {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println("Top: "+stack.peek()); // 3
        stack.pop();
        stack.pop();
        System.out.println("Top: "+stack.peek()); // 1
        stack.pop();
        System.out.println(stack); // []

        
        
        
    }
}
