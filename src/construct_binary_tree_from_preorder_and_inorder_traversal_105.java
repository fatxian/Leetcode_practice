import java.util.Arrays;

public class construct_binary_tree_from_preorder_and_inorder_traversal_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int mid = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                mid = i;
                break;
            }
        }
        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, mid + 1);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, mid);
        root.left = buildTree(leftPreorder, leftInorder);

        int[] rightPreorder = Arrays.copyOfRange(preorder, mid+1, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, mid+1, inorder.length);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }

//    private int preIdx;
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        preIdx = 0;
//        return build(preorder, inorder, 0, inorder.length - 1);
//    }
//
//    private TreeNode build(int[] preorder, int[] inorder, int inL, int inR) {
//        if (inL > inR) return null;
//        int rootVal = preorder[preIdx++];
//        TreeNode root = new TreeNode(rootVal);
//
//        int mid = inL;
//        while (mid <= inR && inorder[mid] != rootVal) mid++;
//
//        root.left  = build(preorder, inorder, inL, mid - 1);
//        root.right = build(preorder, inorder, mid + 1, inR);
//        return root;
//    }



//    private Map<Integer, Integer> idx; // inorder 值 -> 索引
//    private int preIdx;                // 指向當前 root 在 preorder 的位置
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        if (preorder == null || inorder == null || preorder.length == 0) return null;
//
//        idx = new HashMap<>();
//        for (int i = 0; i < inorder.length; i++) idx.put(inorder[i], i);
//
//        preIdx = 0;
//        return build(preorder, 0, inorder.length - 1);
//    }
//
//    private TreeNode build(int[] preorder, int inL, int inR) {
//        if (inL > inR) return null;
//
//        int rootVal = preorder[preIdx++];      // 取當前根
//        TreeNode root = new TreeNode(rootVal);
//
//        int mid = idx.get(rootVal);            // 根在 inorder 的位置
//        root.left  = build(preorder, inL, mid - 1);  // 左子樹
//        root.right = build(preorder, mid + 1, inR);  // 右子樹
//        return root;
//    }


//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        if (preorder == null || preorder.length == 0) return null;
//
//        Deque<TreeNode> stack = new ArrayDeque<>();
//        int inIdx = 0;
//
//        TreeNode root = new TreeNode(preorder[0]);
//        stack.push(root);
//
//        for (int i = 1; i < preorder.length; i++) {
//            int val = preorder[i];
//            TreeNode node = stack.peek();
//
//            if (node.val != inorder[inIdx]) {
//                // 還在往左分支
//                node.left = new TreeNode(val);
//                stack.push(node.left);
//            } else {
//                // 回溯到需要接右子的祖先
//                while (!stack.isEmpty() && stack.peek().val == inorder[inIdx]) {
//                    node = stack.pop();
//                    inIdx++;
//                }
//                node.right = new TreeNode(val);
//                stack.push(node.right);
//            }
//        }
//        return root;
//    }

}
