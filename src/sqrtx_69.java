public class sqrtx_69 {
    public int mySqrt(int x) {
        int left = 0;
        int right = x/2+1;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long)mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
//    public int mySqrt(int x) {
//        int left = 0, right = x;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            long square = (long) mid * mid;
//
//            if (square == x) {
//                return mid; // 找到剛好整數平方根
//            } else if (square < x) {
//                left = mid + 1; // 嘗試更大
//            } else {
//                right = mid - 1; // 嘗試更小
//            }
//        }
//        return right; // 當 left > right 時，right 就是整數平方根
//    }
//    牛頓法
//    public int mySqrt(int x) {
//        if (x == 0) return 0;
//        long r = x;
//        while (r * r > x) {
//            r = (r + x / r) / 2; // 牛頓迭代
//        }
//        return (int) r;
//    }
}
