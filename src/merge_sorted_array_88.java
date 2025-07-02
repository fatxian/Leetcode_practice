public class merge_sorted_array_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }

        for (int i = 0; i < m + n; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (nums1[i] > nums1[j]) {
                    int q = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = q;
                }
            }
        }
    }
}
