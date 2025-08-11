import java.util.ArrayList;
import java.util.List;

public class binary_tree_inorder_traversal_94 {
    ArrayList<Integer> ans = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return ans;
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);
        return ans;
    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        dfs(root, ans);
//        return ans;
//    }
//    private void dfs(TreeNode node, List<Integer> ans) {
//        if (node == null) return;
//        dfs(node.left, ans);
//        ans.add(node.val);
//        dfs(node.right, ans);
//    }


//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        Deque<TreeNode> stack = new ArrayDeque<>();
//        TreeNode cur = root;
//        while (cur != null || !stack.isEmpty()) {
//            while (cur != null) {        // 一路往左壓棧
//                stack.push(cur);
//                cur = cur.left;
//            }
//            cur = stack.pop();           // 彈出=中序「中」
//            ans.add(cur.val);
//            cur = cur.right;             // 轉向右子樹
//        }
//        return ans;
//    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        TreeNode cur = root, pre;
//        while (cur != null) {
//            if (cur.left == null) {          // 沒左子樹，直接訪問
//                ans.add(cur.val);
//                cur = cur.right;
//            } else {
//                pre = cur.left;              // 找左子樹最右節點
//                while (pre.right != null && pre.right != cur) pre = pre.right;
//                if (pre.right == null) {     // 建線索
//                    pre.right = cur;
//                    cur = cur.left;
//                } else {                     // 拆線索並訪問
//                    pre.right = null;
//                    ans.add(cur.val);
//                    cur = cur.right;
//                }
//            }
//        }
//        return ans;
//    }
}
