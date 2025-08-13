import java.util.ArrayList;
import java.util.List;

public class subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, subset, res);
        return res;
    }

    private void dfs(int[] nums, int i, List<Integer> subset, List<List<Integer>> res) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(nums, i + 1, subset, res);
        subset.remove(subset.size() - 1);
        dfs(nums, i + 1, subset, res);
    }

//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        res.add(new ArrayList<>()); // 先放空集合
//
//        for (int x : nums) {
//            int size = res.size();
//            for (int i = 0; i < size; i++) {
//                List<Integer> next = new ArrayList<>(res.get(i));
//                next.add(x);
//                res.add(next);
//            }
//        }
//        return res;
//    }

//    public List<List<Integer>> subsets(int[] nums) {
//        int n = nums.length;
//        int total = 1 << n;           // 2^n
//        List<List<Integer>> res = new ArrayList<>(total);
//
//        for (int mask = 0; mask < total; mask++) {
//            List<Integer> subset = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                if ((mask & (1 << i)) != 0) {
//                    subset.add(nums[i]);
//                }
//            }
//            res.add(subset);
//        }
//        return res;
//    }
}
