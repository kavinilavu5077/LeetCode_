class Solution {
    public int fib(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1); 

        return fibHelper(n, dp);
    }

    public int fibHelper(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        } else {
            dp[n] = fibHelper(n - 1, dp) + fibHelper(n - 2, dp);
        }
        return dp[n];
    }
}

