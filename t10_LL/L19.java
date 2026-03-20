public class L19 {
    
}

class ListNode5 {
    int val;
    ListNode5 next;
    ListNode5() {}
    ListNode5(int val) { this.val = val; }
    ListNode5(int val, ListNode5 next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode5 removeNthFromEnd(ListNode5 head, int n) {
        // head = 1->2->3->4->5->null
        ListNode5 temp = new ListNode5(0);
        temp.next = head;
        ListNode5 slow = temp;
        ListNode5 fast = temp;

        // slow = 3->4->5->null
        // fast move n = null

        for(int i=0;i<=n;i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        // slow = 3->5->null
        

        // res = 1->2->3->5->null
        return temp.next;
    }
}