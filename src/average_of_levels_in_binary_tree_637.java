import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class average_of_levels_in_binary_tree_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return ans;
        queue.offer(root);
        Double count = 0.0;
        Double sum = 0.0;
        while (!queue.isEmpty()) {
            for(TreeNode q : queue){
                sum += Double.valueOf(q.val);
                count ++;
            }
            ans.add(sum/count);
            while(count>0){
                TreeNode current = queue.poll();
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
                count--;
            }
            sum = 0.0;
        }
        return ans;
    }
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> result = new ArrayList<>();
//        if (root == null) return result;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();  // 當層節點數
//            long sum = 0;
//
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode current = queue.poll();
//                sum += current.val;
//
//                if (current.left != null) queue.offer(current.left);
//                if (current.right != null) queue.offer(current.right);
//            }
//
//            result.add((double) sum / levelSize);  // 計算平均
//        }
//
//        return result;
//    }


}
