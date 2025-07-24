public class merge_two_sorted_lists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 建立虛擬頭節點
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        // 當兩個 list 都還有節點時
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // 推進指標
        }

        // 把剩下的接上（可能是 list1 或 list2）
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next; // 回傳去掉虛擬頭的 list
    }

}

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
