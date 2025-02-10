class Solution {
    public int[] findErrorNums(int[] nums) {
          boolean arr[]=new boolean[nums.length+1];
          int mis=0;
          int dup=0;
         for( int n : nums){
         if(arr[n]){
            dup=n;
        }
        arr[n]=true;
    }
    for(int i=1;i<=nums.length;i++){
        if(!arr[i]){
            mis=i;
        }
    }
    return new int[]{dup,mis};
    
}     
    
}