import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class binary_tree_right_side_view_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) return res;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        TreeNode cur = root;
        while(!q.isEmpty()){
            int length = q.size();
            for(int i = 0; i < length; i++){
                cur = q.poll();
                if(i==0){
                    res.add(cur.val);
                }
                if(cur.right!=null) q.offer(cur.right);
                if(cur.left!=null) q.offer(cur.left);
            }
        }
        return res;
    }


//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//
//        while (!q.isEmpty()) {
//            TreeNode rightSide = null;
//            int qLen = q.size();
//
//            for (int i = 0; i < qLen; i++) {
//                TreeNode node = q.poll();
//                if (node != null) {
//                    rightSide = node;
//                    q.offer(node.left);
//                    q.offer(node.right);
//                }
//            }
//            if (rightSide != null) {
//                res.add(rightSide.val);
//            }
//        }
//        return res;
//    }

//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        dfs(root, 0, res);
//        return res;
//    }
//    private void dfs(TreeNode node, int depth, List<Integer> res) {
//        if (node == null) return;
//        if (depth == res.size()) res.add(node.val); // 此層第一次到達（先右後左）
//        dfs(node.right, depth + 1, res);
//        dfs(node.left,  depth + 1, res);
//    }
}
