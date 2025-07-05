public class majority_element_169 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int k = nums[i];
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (k == nums[j]) {
                    c++;
                }
            }
            if (c > n / 2) {
                return k;
            }
        }
        return 0;
    }

    //    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int majority = nums.length / 2;
//
//        for (int n : nums) {
//            map.put(n, map.getOrDefault(n, 0) + 1);
//            if (map.get(n) > majority) {
//                return n;
//            }
//        }
//        return -1; // 題目保證一定存在，多寫一層保險
//    }
    //Boyer–Moore 一票抵一票的概念
//    public int majorityElement(int[] nums) {
//        int count = 0;
//        int candidate = 0;
//
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//            count += (num == candidate) ? 1 : -1;
//        }
//
//        return candidate;
//    }
}
