public class reverse_linked_list_206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;

        // if (head == null || head.next == null) {
        //     return head;
        // }

        // ListNode newHead = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return newHead;
    }
}
