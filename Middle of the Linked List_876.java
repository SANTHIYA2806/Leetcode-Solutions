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
    public ListNode middleNode(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;

       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
       }
       return slow;
    }
}

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int middle = (count/2) + 1;
        temp = head;
        while(temp!=null){
            middle += - 1;
            if(middle != 0){
                temp  =temp.next;
            }
            else{
                break;
            }
        }
        return temp;
    }
}
*/
