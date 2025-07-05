public class remove_duplicates_from_sorted_array_26 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                nums[k + 1] = nums[i];
                k++;
            }
        }
        return k + 1;
    }
//    public int removeDuplicates(int[] nums) {
//        if (nums.length == 0) return 0;
//
//        int i = 1;
//
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[j] != nums[i - 1]) {
//                nums[i] = nums[j];
//                i++;
//            }
//        }
//
//        return i;
//    }
}
