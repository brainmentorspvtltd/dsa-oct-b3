public class Node{
    int val;
    Node left;
    Node right;
    Node(int data){
        val = data;
    }
    @Override
    public String toString() {
        return "Node [val=" + val + ", left=" + left + ", right=" + right + "]";
    }
    
}

