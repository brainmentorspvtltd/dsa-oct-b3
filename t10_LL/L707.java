public class L707 {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        ll.addAtHead(4);
        // 4 -> 
        System.out.println(ll.get(1)); // -1
        ll.addAtHead(1);
        // 1 -> 4 -> 
        ll.addAtHead(5);
        // 5 -> 1 -> 4 -> 
        ll.deleteAtIndex(3);
        // 5 -> 1 -> 4 -> 

        ll.addAtHead(7);
        // 7 -> 5 -> 1 -> 4 -> 
        System.out.println(ll.get(3)); // 4
        System.out.println(ll.get(3)); // 4
        System.out.println(ll.get(3)); // 4
        ll.addAtHead(1);
        // 1 -> 7 -> 5 -> 1 -> 4 -> 
        ll.deleteAtIndex(4);
        // 1 -> 7 -> 5 -> 1 ->  

        System.out.println(ll.head);
        }
}
class Node{
    int val;
    Node next;
    Node(int a){
        val = a;
        next = null;
    }
    @Override
    public String toString() {
        return val + " -> " + next;
    }
}
class MyLinkedList {
    Node head = null;
    int size = 0;
    public MyLinkedList() {
        
    }
    
    public int get(int index) { // 4
        if(size==0 || index<0 || index>=size){
            return -1;
        } 
        // 3
        Node curr = head;
        for(int i=0;i<index;i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        if(head==null){
            head = new Node(val);
        } else {
            Node n = new Node(val);
            n.next = head;
            head = n;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        // 2 ->
        if(head == null){
            head = new Node(val);
            size++;
            return;
        }
        // 8 -> 1 -> 3 -> 5 -> val
        // h              c
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = new Node(val);

        size++;
    }
    
    public void addAtIndex(int index, int val) {//1 -> 3 -> 5 -> 2 -> 8 -> 
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
        } else if(index==size){
            addAtTail(val);
        } else {
            Node curr = head;
            for(int i=1;i<index;i++){
                curr = curr.next;
            }
            Node n = new Node(val);
            n.next = curr.next;
            curr.next = n;

            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size || size==0){
            return;
        }
        size--;
        if(index == 0){
            Node firstNode = head;
            head = firstNode.next;
            return;
        }

        Node currentHead = head;
        for(int i=0;i<index-1;i++){
            currentHead = currentHead.next;
        }
        if(currentHead.next!=null){
            currentHead.next = currentHead.next.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */