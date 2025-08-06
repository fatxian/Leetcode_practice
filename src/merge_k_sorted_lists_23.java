public class merge_k_sorted_lists_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        if (length == 0) return null;
        if(length == 1 && lists[0]==null) return null;

        ListNode result = new ListNode();

        for (int i = 0; i < length - 1; i++) {
            lists[i+1] = merge(lists, i, i + 1);
        }
        return lists[length-1];
    }

    public ListNode merge(ListNode[] lists, int left, int right) {
        ListNode leftList = lists[left];
        ListNode rightList = lists[right];
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (leftList != null && rightList != null) {
            if (leftList.val <= rightList.val) {
                curr.next = leftList;
                leftList = leftList.next;
            } else {
                curr.next = rightList;
                rightList = rightList.next;
            }
            curr = curr.next;
        }

        if (leftList != null) {
            curr.next = leftList;
        } else {
            curr.next = rightList;
        }

        return dummy.next;
    }
}
//分而治之
//class Solution {
//    public ListNode mergeKLists(ListNode[] lists) {
//        if (lists == null || lists.length == 0) return null;
//        return mergeRange(lists, 0, lists.length - 1);
//    }
//
//    private ListNode mergeRange(ListNode[] lists, int left, int right) {
//        if (left == right) return lists[left];
//        int mid = left + (right - left) / 2;
//        ListNode l1 = mergeRange(lists, left, mid);
//        ListNode l2 = mergeRange(lists, mid + 1, right);
//        return mergeTwoLists(l1, l2);
//    }
//
//    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode();
//        ListNode curr = dummy;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                curr.next = l1;
//                l1 = l1.next;
//            } else {
//                curr.next = l2;
//                l2 = l2.next;
//            }
//            curr = curr.next;
//        }
//        curr.next = (l1 != null) ? l1 : l2;
//        return dummy.next;
//    }
//}

//分而治之2
//public class Solution {
//    public ListNode mergeKLists(ListNode[] lists) {
//        if (lists == null || lists.length == 0) {
//            return null;
//        }
//
//        while (lists.length > 1) {
//            List<ListNode> mergedLists = new ArrayList<>();
//            for (int i = 0; i < lists.length; i += 2) {
//                ListNode l1 = lists[i];
//                ListNode l2 = (i + 1) < lists.length ? lists[i + 1] : null;
//                mergedLists.add(mergeList(l1, l2));
//            }
//            lists = mergedLists.toArray(new ListNode[0]);
//        }
//        return lists[0];
//    }
//
//    private ListNode mergeList(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode();
//        ListNode tail = dummy;
//
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                tail.next = l1;
//                l1 = l1.next;
//            } else {
//                tail.next = l2;
//                l2 = l2.next;
//            }
//            tail = tail.next;
//        }
//
//        if (l1 != null) {
//            tail.next = l1;
//        }
//        if (l2 != null) {
//            tail.next = l2;
//        }
//
//        return dummy.next;
//    }
//}