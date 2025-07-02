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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ListNode temp1 = list1;
        while (temp1 != null) {
            al1.add(temp1.val);
            temp1 = temp1.next;
        }
        
        ArrayList<Integer> al2 = new ArrayList<>();
        ListNode temp2 = list2;
        while (temp2 != null) {
            al2.add(temp2.val);
            temp2 = temp2.next;
        }
        
        al1.addAll(al2);
        Collections.sort(al1);
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        for (int i = 0; i < al1.size(); i++) {
            int x = al1.get(i);
            current.next = new ListNode(x);
            current = current.next;
        }
        
        return dummy.next;
    }
}