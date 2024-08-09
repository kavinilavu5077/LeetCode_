class Solution {
    // Memoization array to store results of subproblems
    private int[] memo;

    public int tribonacci(int n) {
        // Initialize the memoization array with -1 (indicating that no results have been computed yet)
        memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        
        // Start the recursion
        return tribonacciHelper(n);
    }

    private int tribonacciHelper(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
    
        if (memo[n] != -1) return memo[n];
        
        
        memo[n] = tribonacciHelper(n - 1) + tribonacciHelper(n - 2) + tribonacciHelper(n - 3);
        
        return memo[n];
    }
}
