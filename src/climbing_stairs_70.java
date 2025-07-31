public class climbing_stairs_70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);
    }
//記憶遞迴
//    int[] memo;
//    public int climbStairs(int n) {
//        memo = new int[n+1];
//        return dfs(n);
//    }
//    private int dfs(int n) {
//        if (n <= 2) return n;
//        if (memo[n] != 0) return memo[n];
//        memo[n] = dfs(n-1) + dfs(n-2);
//        return memo[n];
//    }
//動態規劃
//    public int climbStairs(int n) {
//        if (n <= 2) return n;
//
//        int[] dp = new int[n + 1];
//        dp[1] = 1;
//        dp[2] = 2;
//
//        for (int i = 3; i <= n; i++) {
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//
//        return dp[n];
//    }

//    public int climbStairs(int n) {
//        if (n <= 2) return n;
//        int a = 1, b = 2;
//        for (int i = 3; i <= n; i++) {
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//        return b;
//    }
}
