public class L83 {
    
}
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}

class Solution {
    public static ListNode2 deleteDuplicates(ListNode2 head) {
        ListNode2 temp = head;
        if(head==null || head.next==null){
            return head;
        }
        while(head!=null && head.next!=null){
            if(head.val == head.next.val){
                // move next pointer to next.next
                head.next = head.next.next;
            } else {
                // move pointer to next
                head = head.next;
            }
        }
        return temp;
    }
}