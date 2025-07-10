public class two_sum_1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[0];
    }

//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>(); // value → index
//
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//
//            map.put(nums[i], i);
//        }
//
//        return new int[0]; // 不會發生，因為題目保證有解
//    }
}
