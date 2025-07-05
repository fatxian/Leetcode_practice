public class remove_element_27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] == val && nums[j] != val) {
                    int q = nums[i];
                    nums[i] = nums[j];
                    nums[j] = q;
                }
            }

        }
        return k;
    }

//    public int removeElement(int[] nums, int val) {
//        int k = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[k] = nums[i];
//                k++;
//            }
//        }
//
//        return k;
//    }
}
