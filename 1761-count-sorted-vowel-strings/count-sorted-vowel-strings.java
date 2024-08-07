class Solution {
    public int countVowelStrings(int n) {
        String[] s = new String[] { "a", "e", "i", "o", "u" };
        int[][] dp = new int[5][n + 1];
        for(int i=0;i<s.length;i++)
            dp[i][0] = 1;
        for(int i =4;i>=0;i--){
            for(int j=1;j<=n;j++){
                int pick = dp[i][j-1];
                int notPick = 0;
              if(i<4) notPick = dp[i+1][j];
                dp[i][j] = (pick+notPick);
            }
        }
        return dp[0][n];
    }
}