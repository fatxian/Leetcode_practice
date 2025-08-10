public class insert_into_a_binary_search_tree_701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        if(root.val>val){
            root.left = insertIntoBST(root.left, val);
        }else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
//    public TreeNode insertIntoBST(TreeNode root, int val) {
//        if (root == null) return new TreeNode(val);
//
//        TreeNode curr = root;
//        while (true) {
//            if (val < curr.val) {
//                if (curr.left == null) {
//                    curr.left = new TreeNode(val);
//                    break;
//                }
//                curr = curr.left;
//            } else { // 相等走右
//                if (curr.right == null) {
//                    curr.right = new TreeNode(val);
//                    break;
//                }
//                curr = curr.right;
//            }
//        }
//        return root;
//    }
}
