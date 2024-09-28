class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> common = new HashSet<>();
        HashSet<Integer> copy = new HashSet<>();
        for(int val : nums1){
            copy.add(val);
        }
        for(int val : nums2){
            if(copy.contains(val)){
                common.add(val);
            }
        }
       
        int[] arr = new int[common.size()];
        int index = 0;
        for (int val : common) {
            arr[index++] = val;
        }
        
        
    return arr;
}}