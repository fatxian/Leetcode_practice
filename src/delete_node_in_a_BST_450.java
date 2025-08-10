public class delete_node_in_a_BST_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                TreeNode minNode = findMin(root.right);
                root.val = minNode.val;
                root.right = deleteNode(root.right, minNode.val);
            }
        }
        return root;
    }
    public TreeNode findMin(TreeNode root){
        TreeNode curr = root;
        while(curr!=null&&curr.left!=null){
            curr = curr.left;
        }
        return curr;
    }

//    public TreeNode deleteNode(TreeNode root, int key) {
//        TreeNode parent = null, curr = root;
//
//        // 1) 先找到 key
//        while (curr != null && curr.val != key) {
//            parent = curr;
//            curr = (key < curr.val) ? curr.left : curr.right;
//        }
//        if (curr == null) return root; // 沒找到
//
//        // 2) 若有兩子樹：用右子樹最小值覆蓋，再把目標改成刪那個最小值節點
//        if (curr.left != null && curr.right != null) {
//            TreeNode sParent = curr, s = curr.right;
//            while (s.left != null) { sParent = s; s = s.left; }
//            curr.val = s.val;             // 覆蓋值
//            parent = sParent;             // 下面把 curr 視為要刪的目標
//            curr = s;                     // 轉為刪 successor 節點（此時最多一子樹）
//        }
//
//        // 3) 處理 0 或 1 子樹的刪除
//        TreeNode child = (curr.left != null) ? curr.left : curr.right;
//
//        if (parent == null) {
//            // 刪的是根
//            return child;
//        }
//        if (parent.left == curr) parent.left = child;
//        else parent.right = child;
//
//        return root;
//    }
}
