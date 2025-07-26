import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class minimum_absolute_difference_in_bst_530 {
    public int getMinimumDifference(TreeNode root) {
        if (root == null)
            return 0;
        int diff = Integer.MAX_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            array.add(current.val);
            if (current.left != null)
                queue.offer(current.left);
            if (current.right != null)
                queue.offer(current.right);
        }

        Collections.sort(array);

        for(int i = 0; i < array.size()-1; i++){
            int diffTemp = array.get(i+1) - array.get(i);
            if(diffTemp < diff){
                diff = diffTemp;
            }
        }

        return diff;
    }

//    class Solution {
//        private Integer prev = null;            // 儲存「前一個」節點的值（依照中序順序）
//        private int minDiff = Integer.MAX_VALUE; // 初始設定成最大值
//
//        public int getMinimumDifference(TreeNode root) {
//            inOrder(root);                      // 啟動中序遞迴
//            return minDiff;
//        }
//
//        private void inOrder(TreeNode node) {
//            if (node == null) return;
//
//            // 1. 遞迴左子樹
//            inOrder(node.left);
//
//            // 2. 中間處理：與前一個節點比較差值
//            if (prev != null) {
//                minDiff = Math.min(minDiff, node.val - prev);
//            }
//            prev = node.val; // 更新 prev 為目前的節點值
//
//            // 3. 遞迴右子樹
//            inOrder(node.right);
//        }
//    }
}
