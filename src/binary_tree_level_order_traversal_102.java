import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class binary_tree_level_order_traversal_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        List<Integer> innerList;
        List<List<Integer>> outerList = new LinkedList<>();
        if(root == null) return outerList;
        TreeNode cur = root;
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            innerList = new LinkedList<>();
            for(int i = 0; i < levelSize; i++){
                cur = q.poll();
                innerList.add(cur.val);
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
            }
            outerList.add(innerList);
        }
        return outerList;
    }

//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        dfs(root, 0, res);
//        return res;
//    }
//    private void dfs(TreeNode node, int depth, List<List<Integer>> res) {
//        if (node == null) return;
//        if (depth == res.size()) res.add(new ArrayList<>());
//        res.get(depth).add(node.val);
//        dfs(node.left, depth + 1, res);
//        dfs(node.right, depth + 1, res);
//    }
}


