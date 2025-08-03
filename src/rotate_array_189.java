public class rotate_array_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n);
        reverse(nums, 0, k);
        reverse(nums, k, n);
    }
    public void reverse(int[] arr, int start, int end) {
        int memo = 0;
        for (int i = start; i < (start + end) / 2; i++) {
            memo = arr[i];
            arr[i] = arr[end - 1 - i + start];
            arr[end - 1 - i + start] = memo;
        }
    }

//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k %= n;
//        reverse(nums, 0, n - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, n - 1);
//    }
//    private void reverse(int[] arr, int start, int end) {
//        while (start < end) {
//            int temp = arr[start];
//            arr[start++] = arr[end];
//            arr[end--] = temp;
//        }
//    }

//public void rotate(int[] nums, int k) {
//    int n = nums.length;
//    k = k % n;
//    int[] temp = new int[n];
//
//    for (int i = 0; i < n; i++) {
//        temp[(i + k) % n] = nums[i];
//    }
//
//    for (int i = 0; i < n; i++) {
//        nums[i] = temp[i];
//    }
//}

//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k = k % n;
//        int count = 0;
//
//        for (int start = 0; count < n; start++) {
//            int current = start;
//            int prev = nums[start];
//
//            do {
//                int next = (current + k) % n;
//                int temp = nums[next];
//                nums[next] = prev;
//                prev = temp;
//                current = next;
//                count++;
//            } while (start != current);
//        }
//    }
}
