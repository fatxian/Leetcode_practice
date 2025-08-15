import java.util.Comparator;
import java.util.PriorityQueue;

public class kth_largest_element_in_an_array_215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
        }
        while (k > 1) {
            pq.poll();
            k--;
        }
        return pq.peek();
    }



//    public int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k); // 小根堆
//        for (int x : nums) {
//            if (minHeap.size() < k) {
//                minHeap.offer(x);
//            } else if (x > minHeap.peek()) { // 只在更大時才替換
//                minHeap.poll();
//                minHeap.offer(x);
//            }
//        }
//        return minHeap.peek();
//    }


//quickselect
//    private final Random rand = new Random();
//
//    public int findKthLargest(int[] nums, int k) {
//        int target = nums.length - k; // 第 (n-k) 小
//        int l = 0, r = nums.length - 1;
//        while (l <= r) {
//            int p = partition(nums, l, r);
//            if (p == target) return nums[p];
//            if (p < target) l = p + 1;
//            else r = p - 1;
//        }
//        return -1; // 不會到這
//    }
//
//    private int partition(int[] a, int l, int r) {
//        int pi = l + rand.nextInt(r - l + 1); // 隨機樞紐，避免最壞
//        swap(a, pi, r);
//        int pivot = a[r];
//        int i = l;
//        for (int j = l; j < r; j++) {
//            if (a[j] <= pivot) swap(a, i++, j);
//        }
//        swap(a, i, r);
//        return i;
//    }
//
//    private void swap(int[] a, int i, int j) {
//        int t = a[i]; a[i] = a[j]; a[j] = t;
//    }
}
