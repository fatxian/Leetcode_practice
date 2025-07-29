public class single_number_136 {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
//    public int singleNumber(int[] nums) {
//        int ans = 0;
//        for (int num : nums) {
//            ans ^= num;
//        }
//        return ans;
//    }
}
