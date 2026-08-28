/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        // int pos = sc.nextInt();
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        if(head == null || head.next == null){
            return null;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle){
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = slow;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}