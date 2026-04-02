import java.util.Scanner;

public class T1_basicTree {
    static Scanner sc = new Scanner(System.in);
    static String current = "root";

    public static Node createTree(){
        System.out.print("Enter "+current+" value: ");
        int input = sc.nextInt();
        if(input < 0){
            return null;
        }
        Node node = new Node(input);
        current = "Left of "+input;
        node.left = createTree();
        current = "Right of "+input;
        node.right = createTree();
        current = "root";
        return node;
    }

    public static void main(String[] args) {
        Node node = T1_basicTree.createTree();
        System.out.println(node);
    }
    public static void main_1(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        
        n1.left = n2;
        n1.right = n3;

        System.out.println(n1);
    }
}

