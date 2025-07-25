public class symmetric_tree_101 {
    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;

        if (root == null)
            return true;

        return helper(left, right);
    }

    public boolean helper(TreeNode p, TreeNode q) {

        if(p==null&&q==null)
            return true;
        if(p==null||q==null)
            return false;
        if (p.val != q.val)
            return false;
        if (p.left != null && q.right != null) {
            if (p.left.val != q.right.val)
                return false;
        }
        if (p.right != null && q.left != null) {
            if (p.right.val != q.left.val)
                return false;
        }
        return helper(p.left, q.right) && helper(p.right, q.left);
    }
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) return true;
//        return isMirror(root.left, root.right);
//    }
//
//    private boolean isMirror(TreeNode p, TreeNode q) {
//        if (p == null && q == null) return true;
//        if (p == null || q == null) return false;
//        if (p.val != q.val) return false;
//
//        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
//    }
}
