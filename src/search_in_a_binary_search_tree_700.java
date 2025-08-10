public class search_in_a_binary_search_tree_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;

        if(root.val>val){
            root = searchBST(root.left, val);
        }else{
            root = searchBST(root.right,val);
        }
        return root;
    }

    //    public TreeNode searchBST(TreeNode root, int val) {
//        if (root == null || root.val == val) return root;
//        return (val < root.val)
//                ? searchBST(root.left, val)
//                : searchBST(root.right, val);
//    }

//    public TreeNode searchBST(TreeNode root, int val) {
//        TreeNode curr = root;
//        while (curr != null) {
//            if (val == curr.val) return curr;
//            curr = (val < curr.val) ? curr.left : curr.right;
//        }
//        return null;
//    }
}
