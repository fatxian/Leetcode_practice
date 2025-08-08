public class binary_search_704 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;   // 避免溢位
            if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
// LowerBound 注意這邊邊界是左閉右開 為了找插入值
//    public int search(int[] nums, int target) {
//        int l = 0, r = nums.length;
//
//        while (l < r) {
//            int m = l + (r - l) / 2;
//            if (nums[m] >= target) {
//                r = m;
//            } else {
//                l = m + 1;
//            }
//        }
//        return (l < nums.length && nums[l] == target) ? l : -1;
//    }
}
