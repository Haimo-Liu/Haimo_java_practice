/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(-10);
//        ListNode cur = dummy;
//        int carry = 0;
//
//        while(l1 != null || l2 != null){
//            int d1 = 0;
//            int d2 = 0;
//            int sum = 0;
//
//            if(l1 != null) {d1 = l1.val;} else {d1 = 0;}
//            if(l2 != null) {d2 = l2.val;} else {d2 = 0;}
//
//            if(d1+d2 >= 10) {
//                sum = d1 + d2 -10 + carry;
//                carry = 1;
//            } else{
//                sum = d1 + d2 + carry;
//                carry = 0;
//            }
//
//            cur.next = new ListNode(sum);
//
//            if(l1 != null) {l1 = l1.next;}
//            if(l2 != null) {l2 = l2.next;}
//
//            if(cur != null) {cur = cur.next;}
//        }
//        if(carry == 1) {cur.next = new ListNode(1);}
//        return dummy.next;
//    }
//}