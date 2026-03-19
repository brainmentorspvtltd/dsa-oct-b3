import java.util.Stack;

public class L232{
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop()); // 1
        System.out.println(q.pop()); // 2
        System.out.println(q.pop()); // 3
        System.out.println(q.pop()); // ?
        
    }
}

class MyQueue {
    Stack<Integer> s1 = null; // push
    Stack<Integer> s2 = null; // pop
    
    public MyQueue() {
        s1 = new Stack<>(); // push
        s2 = new Stack<>(); // pop
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public int peek() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
        
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

