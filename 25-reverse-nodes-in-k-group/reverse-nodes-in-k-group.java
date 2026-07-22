class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head), prev = dummy, curr = head;
        int count = 0;
        
        while (curr != null) { count++; curr = curr.next; } 
        
        while (count >= k) {
            curr = prev.next;
            for (int i = 1; i < k; i++) {
                ListNode next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev = curr;
            count -= k;
        }
        return dummy.next;
    }
}
