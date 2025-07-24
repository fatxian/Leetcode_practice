public class maximum_depth_of_binary_tree_104 {

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root != null){
            depth++;
        }else{
            return depth;
        }
        int rightDepth = maxDepth(root.right);
        int leftDepth = maxDepth(root.left);
        if(rightDepth>leftDepth) {
            return depth+rightDepth;
        }
        if(rightDepth<=leftDepth){
            return depth+leftDepth;
        }
        return depth;
    }

//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0; // 空節點深度為 0
//        }
//        int leftDepth = maxDepth(root.left);
//        int rightDepth = maxDepth(root.right);
//        return Math.max(leftDepth, rightDepth) + 1;
//    }
// BFS解法
//    public int maxDepth(TreeNode root) {
//        if (root == null) return 0;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        int depth = 0;
//
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size(); // 當前層的節點數
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode current = queue.poll();
//                if (current.left != null) queue.offer(current.left);
//                if (current.right != null) queue.offer(current.right);
//            }
//            depth++; // 每跑完一層，depth 加 1
//        }
//
//        return depth;
//    }
}

public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
        this.right = right;
     }
 }

