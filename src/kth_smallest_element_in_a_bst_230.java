import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class kth_smallest_element_in_a_bst_230 {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list.get(k-1);
    }

//    Deque<TreeNode> stack = new ArrayDeque<>();
//    TreeNode cur = root;
//    int seen = 0;
//
//    while (cur != null || !stack.isEmpty()) {
//        while (cur != null) {
//            stack.push(cur);
//            cur = cur.left;
//        }
//        cur = stack.pop();     // 中序：第 seen+1 小
//        if (++seen == k) return cur.val;
//        cur = cur.right;
//    }
//    throw new IllegalArgumentException("k is out of range");

//    public int kthSmallest(TreeNode root, int k) {
//        int[] ans = new int[2]; // ans[0]=count, ans[1]=value
//        dfs(root, k, ans);
//        if (ans[0] < k) throw new IllegalArgumentException("k is out of range");
//        return ans[1];
//    }
//    private void dfs(TreeNode node, int k, int[] ans) {
//        if (node == null || ans[0] >= k) return;
//        dfs(node.left, k, ans);
//        if (++ans[0] == k) { ans[1] = node.val; return; }
//        dfs(node.right, k, ans);
//    }
}
