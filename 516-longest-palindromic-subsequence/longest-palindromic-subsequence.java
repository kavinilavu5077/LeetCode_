class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int d = 0, i = 0, j = 0;
        int[][] dp = new int[n][n];
        
       
        for (d = 0; d < n; d++) {
            for (i = 0; i < n - d; i++) {
                j = d + i;
                
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
