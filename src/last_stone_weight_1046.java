import java.util.Comparator;
import java.util.PriorityQueue;

public class last_stone_weight_1046 {
    public int lastStoneWeight(int[] stones) {
        if(stones == null) return 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones){
            q.offer(i);
        }
        while(q.size()>1){
            q.offer(q.poll()-q.poll());
        }
        return q.peek();
    }

//    public int lastStoneWeight(int[] stones) {
//        if (stones == null || stones.length == 0) return 0;
//
//        PriorityQueue<Integer> pq =
//                new PriorityQueue<>(stones.length, Comparator.reverseOrder());
//
//        for (int w : stones) pq.offer(w);
//
//        while (pq.size() > 1) {
//            int y = pq.poll();   // 最大
//            int x = pq.poll();   // 次大
//            int diff = y - x;
//            if (diff > 0) pq.offer(diff);  // 相等時不要塞 0 回去
//        }
//        return pq.isEmpty() ? 0 : pq.peek();
//    }


    //因為重量上限小可以用這個方法
//    class Solution {
//        public int lastStoneWeight(int[] stones) {
//            if (stones == null || stones.length == 0) return 0;
//
//            int maxW = 1000;                 // 題目給的上限
//            int[] cnt = new int[maxW + 1];   // cnt[w] = 重量為 w 的石頭數量
//            for (int w : stones) cnt[w]++;
//
//            int carry = 0; // 手上尚未配對的一顆石頭重量（0 表示沒有）
//            for (int w = maxW; w >= 1; w--) {
//                int c = cnt[w];
//                if (c == 0 && carry != w) continue;
//
//                // 先用當前重量和「手上那顆」相撞一次（如果有）
//                if (carry > 0 && c > 0) {
//                    c--;                 // 拿一顆 w 跟 carry 相撞
//                    int diff = Math.abs(carry - w);
//                    carry = 0;           // 手上的被用掉
//                    if (diff > 0) {
//                        // diff < w，因此回退到較小重量之後會處理到
//                        cnt[diff]++;
//                        // 若 diff == w 其實會回到同一層，讓下面的 c 更新後一起處理也 OK
//                    }
//                }
//
//                // 再把同重量的兩兩相撞（偶數消光、奇數留一顆）
//                if (c % 2 == 1) {
//                    // 留下一顆 w 在手上，等去和下一個更小重量的石頭相撞
//                    if (carry == 0) carry = w;
//                    else {
//                        int diff = Math.abs(carry - w);
//                        carry = 0;
//                        if (diff > 0) cnt[diff]++;
//                    }
//                }
//                // 偶數的 c 都抵銷完，不用特別處理
//            }
//            return carry; // 最後剩下的那顆（或 0）
//        }
//    }

}
