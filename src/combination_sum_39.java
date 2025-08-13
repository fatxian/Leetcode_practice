import java.util.ArrayList;
import java.util.List;

public class combination_sum_39 {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(candidates, target, cur, 0);
        return res;
    }

    private void backtrack(int[] nums, int target, List<Integer> cur, int i) {
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (target < 0 || i >= nums.length) {
            return;
        }
        cur.add(nums[i]);
        backtrack(nums, target-nums[i], cur, i);
        cur.remove(cur.size()-1);
        backtrack(nums, target, cur, i+1);
    }


//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        Arrays.sort(candidates);                 // 有助剪枝
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> path = new ArrayList<>();
//        dfs(candidates, target, 0, path, res);
//        return res;
//    }
//
//    private void dfs(int[] a, int remain, int start, List<Integer> path, List<List<Integer>> res) {
//        if (remain == 0) {
//            res.add(new ArrayList<>(path));      // 拍快照
//            return;
//        }
//        for (int j = start; j < a.length; j++) {
//            if (a[j] > remain) break;            // 剪枝：後面只會更大
//            path.add(a[j]);
//            dfs(a, remain - a[j], j, path, res); // j（可重複使用 a[j]）
//            path.remove(path.size() - 1);        // 回溯
//        }
//    }
}
