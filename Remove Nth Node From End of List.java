class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev =null;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            ListNode newHead=head.next;
            return newHead;
        }
        while(fast.next != null){
           
            slow = slow.next;
            fast= fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
