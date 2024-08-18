class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end = height.length-1;
        int max=0;
        while(start<end){
            int heights = Math.min(height[start],height[end]);
            int width = end-start;
            max=Math.max(max,heights*width);
            if(height[start]<height[end])
                 start++;
            else
              end--;   
        
        }
        return max;
    
}}