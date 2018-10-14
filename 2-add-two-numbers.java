/**
 * 2.add two numbers
 * 
 * https://leetcode.com/problems/add-two-numbers/description/
 * 
 * dec: 您将获得两个非空链表，表示两个非负整数。 数字以相反的顺序存储，每个节点包含一个数字。 添加两个数字并将其作为链接列表返回。
 * 您可以假设这两个数字不包含任何前导零，除了数字0本身。
 * 
 * 
 * Example: Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * 
 * 
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, cur = result;
        int i1 = 0, i2 = 0, carry = 0, n = 0;
        do {
            i1 = (p != null) ? p.val : 0;
            i2 = (q != null) ? q.val : 0;
            n = (i1 + i2 + carry) % 10;
            carry = (i1 + i2 + carry) / 10;
            cur.next = new ListNode(n);
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;

        } while (p != null || q != null);

        return result.next;
    }
}