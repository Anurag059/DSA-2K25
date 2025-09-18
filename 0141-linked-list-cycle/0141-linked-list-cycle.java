public class Solution {
    public boolean hasCycle(ListNode head) {

        //floyd algo use kri h isme
        
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow pointer one step
            fast = fast.next.next;  // Move fast pointer two steps

            if (slow == fast) { // If they meet, a cycle exists
                return true;
            }
        }
        return false; // No cycle detected
    }
}
