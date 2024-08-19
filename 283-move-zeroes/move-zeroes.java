class Solution {
    public void moveZeroes(int[] nums) {
        //Arrays.sort(nums);
        int j =0;
        int count=0;
        for(int i : nums){
            if(i!=0){
                nums[j]=i;
                j++;
            }else{
                count++;
            }
        }
        while(count!=0){
        nums[j]=0;
        j++;
        count--;
    }
    for(int k : nums){
        System.out.print(k);
    }
}}