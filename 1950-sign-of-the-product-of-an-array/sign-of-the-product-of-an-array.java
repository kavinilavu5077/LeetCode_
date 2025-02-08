class Solution {
    public int arraySign(int[] nums) {
       int len = nums.length;
       int nwg =0;
       for(int i=0;i<len;i++){
        if(nums[i]<0)
        nwg++;
        else if(nums[i]==0){
            return 0;
        }
       }
       return (nwg %2 ==0)?1:-1;
    }
}