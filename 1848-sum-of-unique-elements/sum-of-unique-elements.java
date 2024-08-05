import java.util.Arrays;

class Solution {
    public int sumOfUnique(int[] nums){
    Arrays.sort(nums);
        
        int sum = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
                if ((i == 0 || nums[i] != nums[i - 1]) && (i == n - 1 || nums[i] != nums[i + 1])) {
                sum += nums[i];
            }
        }
        
        return sum;
    }
}
