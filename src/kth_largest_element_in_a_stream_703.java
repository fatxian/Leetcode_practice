import java.util.PriorityQueue;

public class kth_largest_element_in_a_stream_703 {
    PriorityQueue<Integer> minHeap;
    int k;
    public kth_largest_element_in_a_stream_703(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for (int i : nums) {
            minHeap.offer(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }
    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

//    List<Integer> arr;
//    int K;
//    public KthLargest(int k, int[] nums) {
//        K = k;
//        arr = new ArrayList();
//        for (int i = 0; i < nums.length; i++) {
//            arr.add(nums[i]);
//        }
//    }
//
//    public int add(int val) {
//        arr.add(val);
//        Collections.sort(arr);
//        return arr.get(arr.size() - K);
//    }
}
