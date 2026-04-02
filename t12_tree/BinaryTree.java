import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
    static String treeInput = "10 20 40 -1 70 -1 -1 -1 30 50 -1 80 -1 90 -1 100 -1 -1 60 -1 -1";
    static Scanner sc = new Scanner(treeInput);

    public static Node createTree(){
        int input = sc.nextInt();
        if(input < 0){
            return null;
        }
        Node node = new Node(input);
        node.left = createTree();
        node.right = createTree();
        return node;
    }

    public static void main(String[] args) {
        Node node = BinaryTree.createTree();
        // System.out.println(node);
        // inOrder(node);
        // System.out.println();
        // inOrderIterative(node);

        // preOrder(node);
        // System.out.println();
        // preOrderIterative(node);

        postOrder(node);
        System.out.println();
        postOrderIterative(node);
    }

    static void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
    static void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    static void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }


    static void inOrderIterative(Node node){
        Stack<Node> stack = new Stack<>();
        Node curr = node;

        while (curr!=null || !stack.isEmpty()) {
            for(;curr!=null;){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.val+" ");
            curr = curr.right;
            // stack.push(curr);
        }
        System.out.println();
    }   
    static void preOrderIterative(Node node){
        Stack<Node> stack = new Stack<>();
        Node curr = node;
        stack.push(curr);
        while(!stack.isEmpty()){
            curr = stack.pop();
            System.out.print(curr.val + " ");
            if(curr.right!=null)
            stack.push(curr.right);
            if(curr.left!=null)
            stack.push(curr.left);
        }
        System.out.println();
    }

    static void postOrderIterative(Node node){
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        Node curr = node;
        stack1.push(curr);
        while(!stack1.isEmpty()){
            curr = stack1.pop();
            stack2.push(curr);
            if(curr.left!=null)
                stack1.push(curr.left);
            if(curr.right!=null)
                stack1.push(curr.right);
        }
        while(!stack2.isEmpty()){
            System.out.print(stack2.pop().val+ " ");
        }
        System.out.println();
    }

}
