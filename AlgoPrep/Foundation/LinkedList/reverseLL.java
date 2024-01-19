//https://leetcode.com/problems/reverse-linked-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        else{
            ListNode curr = head;
            ListNode prev = null;

            while(curr!=null){
                ListNode currp1=curr.next;
                curr.next =prev;
                prev = curr;
                curr = currp1;
            }
            head = prev;
        }
        return head;
    }
}
