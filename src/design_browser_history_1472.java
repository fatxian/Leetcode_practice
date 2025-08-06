class ListNode1 {
    String val;
    ListNode1 next;
    ListNode1 prev;

    ListNode1() {
    }

    ListNode1(String val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }

    ListNode1(String val, ListNode1 prev, ListNode1 next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }

}

public class design_browser_history_1472 {
    private ListNode1 head;
    private ListNode1 curr;

    public design_browser_history_1472(String homepage) {
        head = new ListNode1(homepage);
        curr = head;
    }

    public void visit(String url) {
        curr = new ListNode1(url, curr, null);
    }

    public String back(int steps) {
        for (int i = steps; i > 0; i--) {
            if (curr.prev == null) {
                return curr.val;
            }
            ListNode1 temp = curr;
            curr = curr.prev;
            curr.next = temp;
        }
        return curr.val;
    }

    public String forward(int steps) {
        for (int i = steps; i > 0; i--) {
            if (curr.next == null) {
                return curr.val;
            }
            ListNode1 temp = curr;
            curr = curr.next;
            curr.prev = temp;
        }
        return curr.val;
    }
}

//class ListNode {
//    String val;
//    ListNode next, prev;
//    ListNode(String val) { this.val = val; }
//    ListNode(String val, ListNode prev, ListNode next) {
//        this.val = val; this.prev = prev; this.next = next;
//    }
//}
//
//class BrowserHistory {
//
//    private ListNode curr;
//
//    public BrowserHistory(String homepage) {
//        curr = new ListNode(homepage);
//    }
//
//    public void visit(String url) {
//        // 1) 砍掉 forward 歷史
//        curr.next = null;
//        // 2) 新節點接在 curr 後面
//        ListNode node = new ListNode(url);
//        node.prev = curr;
//        curr.next = node;
//        // 3) 游標前進到新頁
//        curr = node;
//    }
//
//    public String back(int steps) {
//        while (steps > 0 && curr.prev != null) {
//            curr = curr.prev;
//            steps--;
//        }
//        return curr.val;
//    }
//
//    public String forward(int steps) {
//        while (steps > 0 && curr.next != null) {
//            curr = curr.next;
//            steps--;
//        }
//        return curr.val;
//    }
//}


//class BrowserHistory {
//    Deque<String> back = new ArrayDeque<>();
//    Deque<String> forward = new ArrayDeque<>();
//    String curr;
//    public BrowserHistory(String homepage) { curr = homepage; }
//    public void visit(String url) {
//        back.push(curr);
//        curr = url;
//        forward.clear();
//    }
//    public String back(int steps) {
//        while (steps-- > 0 && !back.isEmpty()) {
//            forward.push(curr);
//            curr = back.pop();
//        }
//        return curr;
//    }
//    public String forward(int steps) {
//        while (steps-- > 0 && !forward.isEmpty()) {
//            back.push(curr);
//            curr = forward.pop();
//        }
//        return curr;
//    }
//}


//public class BrowserHistory {
//    private List<String> history;
//    private int cur;
//
//    public BrowserHistory(String homepage) {
//        history = new ArrayList<>();
//        history.add(homepage);
//        cur = 0;
//    }
//
//    public void visit(String url) {
//        cur++;
//        history = history.subList(0, cur);
//        history.add(url);
//    }
//
//    public String back(int steps) {
//        cur = Math.max(0, cur - steps);
//        return history.get(cur);
//    }
//
//    public String forward(int steps) {
//        cur = Math.min(history.size() - 1, cur + steps);
//        return history.get(cur);
//    }
//}