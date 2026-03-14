public class L206 {
    
}

class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4() {}
    ListNode4(int val) { this.val = val; }
    ListNode4(int val, ListNode4 next) { this.val = val; this.next = next; }
}

class Solution {
        public static ListNode4 reverseList(ListNode4 head) {
        ListNode4 p = null;
        ListNode4 s = head;
        while(s!=null){
            ListNode4 temp = s.next;
            s.next = p;
            p = s;
            s = temp;
        }
        return p;
    }
}