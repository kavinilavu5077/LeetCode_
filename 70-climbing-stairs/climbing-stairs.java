class Solution {
    public int Solve(int dp[],int n ){
        if(n==0||n==1){
            return 1;
        }if(dp[n]!= -1){
            return dp[n];
        }else{
            dp[n]=Solve(dp,n-2)+Solve(dp,n-1);
        }
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Solve(dp,n);
    }
}