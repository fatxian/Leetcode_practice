import java.util.Arrays;
import java.util.Comparator;

public class k_closest_points_to_origin_973 {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, Comparator.comparingInt(p -> dist2(p)));
        return Arrays.copyOf(points, k); // 取前 k 個
    }

    private int dist2(int[] p) {
        return p[0] * p[0] + p[1] * p[1]; // 平方距離，避免 sqrt
    }


//    public int[][] kClosest(int[][] points, int K) {
//        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
//        for (int[] point : points) {
//            int dist = point[0] * point[0] + point[1] * point[1];
//            minHeap.offer(new int[]{dist, point[0], point[1]});
//        }
//
//        int[][] result = new int[K][2];
//        for (int i = 0; i < K; ++i) {
//            int[] point = minHeap.poll();
//            result[i] = new int[]{point[1], point[2]};
//        }
//        return result;
//    }



//    public int[][] kClosest(int[][] points, int k) {
//        // 最大堆：距離大的在堆頂
//        PriorityQueue<int[]> pq = new PriorityQueue<>(
//                (a, b) -> Integer.compare(dist2(b), dist2(a))
//        );
//
//        for (int[] p : points) {
//            pq.offer(p);
//            if (pq.size() > k) pq.poll(); // 只保留 k 個最小距離
//        }
//
//        int[][] ans = new int[k][2];
//        for (int i = k - 1; i >= 0; i--) ans[i] = pq.poll(); // 順序不限
//        return ans;
//    }
//
//    private int dist2(int[] p) {
//        return p[0] * p[0] + p[1] * p[1];
//    }
}
