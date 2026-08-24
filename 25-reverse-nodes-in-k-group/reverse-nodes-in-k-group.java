class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode d = new ListNode(0 , head) , p = d , cu = head;
        int c = 0;
        while(cu != null){
            c++;
            cu = cu.next;
        }
        while(c >= k){
            cu = p.next;
            for(int i = 1; i < k; i++){
                ListNode next = cu.next;
                cu.next = next.next;
                next.next = p.next;
                p.next = next;
            }
            p = cu;
            c -= k;
        }
        return d.next;
    }
}
