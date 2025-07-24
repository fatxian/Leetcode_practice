public class invert_binary_tree_226 {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = new TreeNode();
        if (root == null)
            return root;
        if (root.left != null || root.right != null) {
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null) {
            invertTree(root.right);
        }
        return root;
    }

//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;
//
//        // 直接 swap
//        TreeNode temp = root.left;
//        root.left = invertTree(root.right);
//        root.right = invertTree(temp);
//
//        return root;
//    }

//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            TreeNode current = queue.poll();
//
//            // swap left and right
//            TreeNode temp = current.left;
//            current.left = current.right;
//            current.right = temp;
//
//            if (current.left != null) queue.offer(current.left);
//            if (current.right != null) queue.offer(current.right);
//        }
//
//        return root;
//    }
}
