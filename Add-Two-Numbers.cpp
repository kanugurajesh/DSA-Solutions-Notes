/*
  You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
  
  Input: l1 = [2,4,3], l2 = [5,6,4]
  Output: [7,0,8]
  Explanation: 342 + 465 = 807.
*/

class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int carry = 0;
        ListNode* dummy = new ListNode(0);  // Dummy node to simplify the code
        ListNode* current = dummy;
        while (l1 != nullptr || l2 != nullptr || carry != 0) {
            int sum = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + carry;
            carry = sum / 10;

            current->next = new ListNode(sum % 10);
            current = current->next;

            if (l1) l1 = l1->next;
            if (l2) l2 = l2->next;
        }
        return dummy->next;
    }
};
