import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

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

        // postOrder(node);
        // System.out.println();
        // postOrderIterative(node);

        // levelOrderPrint(node);

        // int treeHeight = getHeight(node);
        // System.out.println("Height: "+treeHeight);

        // int nodes = getCount(node);
        // System.out.println("Total Nodes: "+nodes);

        // leftView(node, 1);
        System.out.println(topView(node));
    }

    public static int getHeight(Node node){
        if(node == null){
            return -1;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
        
    }
    static int maxLevel = Integer.MIN_VALUE;
    public static void rightView(Node root, int level){
        // implement
    }
    public static void leftView(Node root, int level){
        if(root == null){
            return;
        }
        if(maxLevel<level){
            System.out.print(root.val+ " ");
            maxLevel = level;
        }

        leftView(root.left, 1+level);
        leftView(root.right, 1+level);
    }

    

    public static int getCount(Node node){
        if(node == null){
            return 0;
        }
        int leftCount = getCount(node.left);
        int rightCount = getCount(node.right);
        
        return 1 + leftCount + rightCount;
        
    }

    public static void levelOrderPrint(Node node){
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        int count = 0;
        while(!q.isEmpty()){
            count++;
            int size = q.size();
            System.out.print("Level "+count+"=> ");
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                System.out.print(curr.val+", ");
                if(curr.left!=null){q.offer(curr.left);}
                if(curr.right!=null){q.offer(curr.right);}
            }
            System.out.println();
        }

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



    public static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        // hd, node
        Map<Integer, Integer> map = new HashMap<>();
        // code here
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, root));
        while(!q.isEmpty()){
            Pair p = q.poll();
            int hd = p.hd;
            Node node = p.node;
            
            // sop(curr.val)
            if(!map.containsKey(hd)){
            // if(map.get(hd)==null){
                map.put(hd, node.val);
            }
            
            if(node.left!=null)
            q.offer(new Pair(hd-1, node.left));
            if(node.right!=null)
            q.offer(new Pair(hd+1, node.right));
        }
        
        
        Set<Integer> sortedKeys = new TreeSet(map.keySet());
        for(int key: sortedKeys){
           list.add(map.get(key));
        }
        
        return list;
    }

}

class Pair{
    int hd;
    Node node;
    Pair(int hd, Node node){
        this.hd = hd;
        this.node = node;
    }
}