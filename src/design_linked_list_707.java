class ListNode {
    int val;
    ListNode next;
    ListNode() {}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class design_linked_list_707 {
    private ListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index<0||index >= size) return -1;
        ListNode curr = head;
        while (index > 0) {
            curr = curr.next;
            index--;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        head = new ListNode(val, head);
        size++;
    }

    public void addAtTail(int val) {
        if(head == null){
            head = new ListNode(val);
        }else{
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new ListNode(val);
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index == size) {
            addAtTail(val);
            return;
        }
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        ListNode curr = head;
        while (index > 1) {
            curr = curr.next;
            index--;
        }
        curr.next = new ListNode(val, curr.next);
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
        } else {
            ListNode curr = head;
            while (index > 1) {
                curr = curr.next;
                index--;
            }
            if (curr.next != null) {
                curr.next = curr.next.next;
            } else {
                curr.next = null;
            }
        }

        size--;
    }
}

//class ListNode {
//    int val;
//    ListNode prev;
//    ListNode next;
//
//    ListNode(int val) {
//        this.val = val;
//        this.prev = null;
//        this.next = null;
//    }
//}

//public class MyLinkedList {
//    ListNode head;
//    ListNode tail;
//
//    MyLinkedList() {
//        head = new ListNode(0);
//        tail = new ListNode(0);
//        head.next = tail;
//        tail.prev = head;
//    }
//
//    int get(int index) {
//        ListNode cur = head.next;
//        while (cur != null && index > 0) {
//            cur = cur.next;
//            index--;
//        }
//        if (cur != null && cur != tail && index == 0) {
//            return cur.val;
//        }
//        return -1;
//    }
//
//    void addAtHead(int val) {
//        ListNode node = new ListNode(val);
//        ListNode next = head.next;
//        ListNode prev = head;
//        prev.next = node;
//        next.prev = node;
//        node.next = next;
//        node.prev = prev;
//    }
//
//    void addAtTail(int val) {
//        ListNode node = new ListNode(val);
//        ListNode next = tail;
//        ListNode prev = tail.prev;
//        prev.next = node;
//        next.prev = node;
//        node.next = next;
//        node.prev = prev;
//    }
//
//    void addAtIndex(int index, int val) {
//        ListNode cur = head.next;
//        while (cur != null && index > 0) {
//            cur = cur.next;
//            index--;
//        }
//        if (cur != null && index == 0) {
//            ListNode node = new ListNode(val);
//            ListNode next = cur;
//            ListNode prev = cur.prev;
//            prev.next = node;
//            next.prev = node;
//            node.next = next;
//            node.prev = prev;
//        }
//    }
//
//    void deleteAtIndex(int index) {
//        ListNode cur = head.next;
//        while (cur != null && index > 0) {
//            cur = cur.next;
//            index--;
//        }
//        if (cur != null && cur != tail && index == 0) {
//            ListNode next = cur.next;
//            ListNode prev = cur.prev;
//            next.prev = prev;
//            prev.next = next;
//        }
//    }
//}


//class MyLinkedList {
//
//    private final ListNode dummy; // 哨兵
//    private int size;
//
//    public MyLinkedList() {
//        dummy = new ListNode(0);
//        size = 0;
//    }
//
//    public int get(int index) {
//        if (index < 0 || index >= size) return -1;
//        ListNode p = dummy.next;
//        for (int i = 0; i < index; i++) p = p.next;
//        return p.val;
//    }
//
//    public void addAtHead(int val) {
//        addAtIndex(0, val);
//    }
//
//    public void addAtTail(int val) {
//        addAtIndex(size, val);
//    }
//
//    public void addAtIndex(int index, int val) {
//        if (index > size) return;           // 超出長度：忽略
//        if (index < 0) index = 0;           // 負索引：當作插到頭
//
//        // 走到 index 的前一個節點
//        ListNode prev = dummy;
//        for (int i = 0; i < index; i++) prev = prev.next;
//
//        prev.next = new ListNode(val, prev.next);
//        size++;
//    }
//
//    public void deleteAtIndex(int index) {
//        if (index < 0 || index >= size) return;
//
//        // 走到 index 的前一個節點
//        ListNode prev = dummy;
//        for (int i = 0; i < index; i++) prev = prev.next;
//
//        prev.next = prev.next.next; // 直接跳過
//        size--;
//    }
//}