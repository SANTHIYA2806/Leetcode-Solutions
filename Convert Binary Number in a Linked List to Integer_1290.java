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
    public int getDecimalValue(ListNode head) {
        int sum = head.val;
        ListNode temp = head.next;

        while(temp!=null){
            sum = (sum*2) + temp.val;
            temp = temp.next;
        }
        return sum;
    }
}
