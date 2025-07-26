public class path_sum_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        if(root == null) return false;
        sum = sum + root.val;
        if(root.right == null && root.left == null){
            if(sum == targetSum){
                return true;
            }else{
                return false;
            }
        }
        return hasPathSum(root.right, targetSum-sum)||hasPathSum(root.left, targetSum-sum);


    }
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//
//        if (root == null) return false;
//        if (root.left == null && root.right == null) {
//            return targetSum == root.val;
//        }
//        return hasPathSum(root.left, targetSum - root.val) ||
//                hasPathSum(root.right, targetSum - root.val);
//    }

//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null) return false;
//
//        Queue<TreeNode> nodeQueue = new LinkedList<>();
//        Queue<Integer> sumQueue = new LinkedList<>();
//
//        nodeQueue.offer(root);
//        sumQueue.offer(root.val);
//
//        while (!nodeQueue.isEmpty()) {
//            TreeNode node = nodeQueue.poll();
//            int sum = sumQueue.poll();
//
//            if (node.left == null && node.right == null && sum == targetSum) {
//                return true;
//            }
//
//            if (node.left != null) {
//                nodeQueue.offer(node.left);
//                sumQueue.offer(sum + node.left.val);
//            }
//
//            if (node.right != null) {
//                nodeQueue.offer(node.right);
//                sumQueue.offer(sum + node.right.val);
//            }
//        }
//
//        return false;
//    }
}
