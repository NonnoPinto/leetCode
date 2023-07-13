/* This solution beats more than 99% of Jvava submissions! */

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sol = new ListNode();
        ListNode tmp = new ListNode();
        ListNode ret = sol;
        int sum = 0;
        int digit1 = 0;
        int digit2 = 0;
        
        while(l1 != null || l2 != null){
            // take digits and sum
            digit1 = (l1 != null) ? l1.val : 0;
            digit2 = (l2 != null) ? l2.val : 0;
            sum = digit1 + digit2 + sol.val;
            // saves value mod 10
            sol.val = (sum) % 10;
            // saves carry
            sum = sum / 10;
            // playing with list
            tmp = sol;
            sol.next = new ListNode(sum);
            tmp = sol;
            sol = sol.next;
            // next list node
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
            // System.out.println(digit1 + " " + digit2);
        }

        if (sol.val == 0)
            tmp.next = null;
        return ret;
    }
}