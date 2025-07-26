public class count_complete_tree_nodes_222 {
    public int countNodes(TreeNode root) {
        int count = 0;
        if (root == null)
            return count;
        count += 1;
        if (root.left == null && root.right == null) {
            return count;
        }
        return count + countNodes(root.left) + countNodes(root.right);
    }

//    public int countNodes(TreeNode root) {
//        if (root == null) return 0;
//        return 1 + countNodes(root.left) + countNodes(root.right);
//    }

//    public int countNodes(TreeNode root) {
//        if (root == null) return 0;
//
//        int leftHeight = getLeftHeight(root);
//        int rightHeight = getRightHeight(root);
//
//        if (leftHeight == rightHeight) {
//            // 滿二元樹：節點數為 2^h - 1，加上 root 就是 2^h
//            return (1 << leftHeight) - 1;
//        } else {
//            // 不是滿的，就遞迴左右子樹
//            return 1 + countNodes(root.left) + countNodes(root.right);
//        }
//    }
//
//    private int getLeftHeight(TreeNode node) {
//        int h = 0;
//        while (node != null) {
//            h++;
//            node = node.left;
//        }
//        return h;
//    }
//
//    private int getRightHeight(TreeNode node) {
//        int h = 0;
//        while (node != null) {
//            h++;
//            node = node.right;
//        }
//        return h;
//    }
}
