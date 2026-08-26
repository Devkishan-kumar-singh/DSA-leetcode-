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
        ListNode temp = head;
        int n = 0;
        if(head == null){
            return 0;
        }
        while(temp != null){
            n++;
            temp = temp.next;
        }


        ListNode curr = head;
        int result = 0;
        while(curr != null){
            n--;
            result = result + curr.val * (int)(Math.pow(2,n));
            curr = curr.next;

        }
        return result;
    }
}