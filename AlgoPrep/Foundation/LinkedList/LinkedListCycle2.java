//https://leetcode.com/problems/linked-list-cycle-ii/
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
        ListNode s =head;
        ListNode f =head;
        if(head ==null || head.next==null){
            return null;
        }
        while(s!=null && f!=null && f.next!=null){
            s = s.next;
            f=f.next.next;
            if(s==f){
                break;
            }
        }
        if(s != f){
            return null;
        }
        
        s=head;
        while(s!=f){
            s=s.next;
            f=f.next;
        }
        return s;
    }
}
